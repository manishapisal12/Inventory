package com.mastek.Dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mastek.Dao.DBC_connection;

//import com.mastek.model.Product;
//import com.mastek.dao.BankAccountRowMapper;
import com.mastek.model.Product;

@Component
public class ProductDao implements IDao<Product> {
	
	
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private ProductRowMapper rowMapper;


	@Autowired
	public ProductDao(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.rowMapper = new ProductRowMapper();
	}

	public ProductDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> findAll() {
		final String sql = "select * from product;";
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Product findById(String id) {
		final String sql = "select * from product where product_id = ?;";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new ProductRowMapper());
	}

	@Override
	public boolean save(Product object) {
		final String sql = "insert into product values(?,?,?,?);";

		return jdbcTemplate.update(sql, object.getProduct_id(), object.getProduct_name(), object.getUnit_price(), object.getAvailable_quantity()) > 0;
	}

	@Override
	public boolean delete(String id) {
		final String sql = "delete from product where product_id=?;";
		return jdbcTemplate.update(sql, id) > 0;
	}
	@Override
    public boolean update( Product object) {
        final String sql="update product set product_name=?,unit_price=?,available_quantity=? where product_id=?";
            return jdbcTemplate.update(sql,object.getProduct_name(),object.getUnit_price(),object.getAvailable_quantity())>0;


		   
	}

	
}	
	
