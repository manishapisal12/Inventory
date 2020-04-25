package com.mastek.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


import com.mastek.Dao.ProductDao;
import com.mastek.model.Product;

public class ProductDoaTest {
	private ProductDao pDao;
	@Test
	void testFindAll() {
		
		assertNotNull(pDao.findAll(), "Expected not null ");

	}

	@Test
	void testFindById() {

		final String id = "P001";
		assertNotNull(pDao.findById(id), "Expected not null ");

	}
	@Test
	void testDeleteTrue() {

	    String id="P001";
		Product p = pDao.findById(id);
	
		assertTrue(pDao.delete(id), "Must return true");

	}
	@Test
	void testSave() {
		Product p=new Product("P001","Maggie",30,100);
		
		assertTrue(pDao.save(p),"Must return true");
	}
	
	@Test
	void testupdate() {
		Product p=new Product("P004","Dairymilk",150,100);
	
		assertTrue(pDao.update(p),"Expecterd not null");
	}



}
