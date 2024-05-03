package com.model;

public class Address {
	private int address_id;
	private String address_state;
	private String address_city;
	private int address_pincode;
	private int customer_id;
	
	//Constructor with parameters
	public Address(int address_id, String address_state, String address_city, int address_pincode, int customer_id) {
		super();
		this.address_id = address_id;
		this.address_state = address_state;
		this.address_city = address_city;
		this.address_pincode = address_pincode;
		this.customer_id = customer_id;
	}
	
	//Constructor
	public Address() {
		
	}


	//Getters and Setters
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getAddress_state() {
		return address_state;
	}
	public void setAddress_state(String address_state) {
		this.address_state = address_state;
	}
	public String getAddress_city() {
		return address_city;
	}
	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}
	public int getAddress_pincode() {
		return address_pincode;
	}
	public void setAddress_pincode(int address_pincode) {
		this.address_pincode = address_pincode;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", address_state=" + address_state + ", address_city="
				+ address_city + ", address_pincode=" + address_pincode + ", customer_id=" + customer_id + "]";
	}
}
