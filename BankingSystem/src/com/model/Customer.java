package com.model;

public class Customer {
	private int customer_id;
	private String customer_first_name;
	private String customer_last_name;
	private String customer_dob;
	
	//Constructor
	public Customer(int customer_id, String customer_first_name, String customer_last_name, String customer_dob) {
		super();
		this.customer_id = customer_id;
		this.customer_first_name = customer_first_name;
		this.customer_last_name = customer_last_name;
		this.customer_dob = customer_dob;
	}
	
	
	//Constructor
	public Customer() {
		
	}



	//Getters and Setters
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_first_name() {
		return customer_first_name;
	}

	public void setCustomer_first_name(String customer_first_name) {
		this.customer_first_name = customer_first_name;
	}

	public String getCustomer_last_name() {
		return customer_last_name;
	}

	public void setCustomer_last_name(String customer_last_name) {
		this.customer_last_name = customer_last_name;
	}

	public String getCustomer_dob() {
		return customer_dob;
	}

	public void setCustomer_dob(String customer_dob) {
		this.customer_dob = customer_dob;
	}

	//toString
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_first_name=" + customer_first_name
				+ ", customer_last_name=" + customer_last_name + ", customer_dob=" + customer_dob + "]";
	}
	
	
}
