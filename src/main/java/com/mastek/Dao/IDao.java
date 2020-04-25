package com.mastek.Dao;

import java.util.List;
import java.util.Set;

import com.mastek.model.Product;

public interface IDao<T> {
	List<T> findAll();
	T findById(String id);
	//boolean save(T object);
	boolean delete (String id);
	boolean update( Product object);
	boolean save(Product object);

}
