package com.mastek.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.servlet.ModelAndView;

	import com.mastek.model.Product;
	import com.mastek.Service.ProductService;

	@RestController
	@RequestMapping("/inventory")
	public class ProductController {
		@Autowired
		private ProductService service;
		private ModelAndView andView;

		
		@GetMapping("/product/{id}")
		public ModelAndView findById(@PathVariable("id") String id) {
			
			return new ModelAndView("product","product", service.findById((id)));
		}

		@GetMapping("/products")
		public ModelAndView findAll() {
			return new ModelAndView("products", "products", service.findAll());
		}

		@PostMapping("/save")
		public ModelAndView save(@ModelAttribute Product p) {
			andView = new ModelAndView("product");
			if (service.save(p)) {
				andView.addObject("product", p);
			} else {
				andView.addObject("error", "product is not available.");
			}
			return andView;
		}
		

		@PostMapping("/delete")
		public ModelAndView delete(@ModelAttribute Product p) {
			andView = new ModelAndView("result");
			
			if(service.delete(p.getProduct_id()))
				andView.addObject("message","Product delete successfull");
			else
				andView.addObject("message", "Product is not deleted");
			
			return andView;
		}
		

}
