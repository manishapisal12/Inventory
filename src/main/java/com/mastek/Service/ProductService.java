package com.mastek.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mastek.Dao.ProductDao;
import com.mastek.model.Product;

//import com.mastek.app.model.BankAccount;
@Service
public class ProductService {
	@Autowired
	private ProductDao pDao;
	
	
	@Transactional(propagation = Propagation.REQUIRED, 
			transactionManager = "transactionManagerName")
	public boolean save(Product p) {

		return pDao.save(p);

	}
	
	public Product findById(String id) {
		return pDao.findById(id);
	}
	
	
	public List<Product> findAll() {
		return pDao.findAll();
	}
	
	public  boolean delete(String id) {
		return pDao.delete(id);
		
	}
	
	public boolean update(Product p) {
		return pDao.update(p);
		
	}

}
