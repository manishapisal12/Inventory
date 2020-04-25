package com.mastek.model;

public class Order_items {
	
	private int product_id;
	private int order_id;
	private int order_quantity;
	
	public Order_items(int product_id, int order_id, int order_quantity) {
		super();
		this.product_id = product_id;
		this.order_id = order_id;
		this.order_quantity = order_quantity;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getOrder_quantity() {
		return order_quantity;
	}

	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}
	
	
	

}
