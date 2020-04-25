package com.mastek.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mastek.model.Product;


@Component
public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p=new Product();
		p.setProduct_id(rs.getString("product_id"));
		p.setProduct_name(rs.getString("product_name"));
		p.setUnit_price(rs.getInt("unit_price"));
		p.setAvailable_quantity(rs.getInt("available_quantity"));
		return p;
		}
}
