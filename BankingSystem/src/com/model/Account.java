package com.model;

public class Account {
	private int account_id;
	private String account_type;
	private double account_balance;
	private int customer_id;
	
	//Constructor
	public Account(int account_id, String account_type, double account_balance, int customer_id) {
		super();
		this.account_id = account_id;
		this.account_type = account_type;
		this.account_balance = account_balance;
		this.customer_id = customer_id;
	}

	
	//Constructor
	public Account() {
		
	}



	//Getters and Setters
	public int getAccount_id() {
		return account_id;
	}


	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}


	public String getAccount_type() {
		return account_type;
	}


	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}


	public double getAccount_balance() {
		return account_balance;
	}


	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}


	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", account_type=" + account_type + ", account_balance="
				+ account_balance + ", customer_id=" + customer_id + "]";
	}
	
	
}
