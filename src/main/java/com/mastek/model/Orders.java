package com.mastek.model;

public class Orders {
	private int order_id;
	private String order_date;
	
	
	public Orders(int order_id, String order_date) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
	}


	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


	public String getOrder_date() {
		return order_date;
	}


	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	
}
