package com.dto;

public class AccountAndCustomer {
	private int account_id;
	private String account_type;
	private double account_balance;
	private int customer_id;
	private String customer_first_name;
	private String customer_last_name;
	private String customer_dob;
	
	
	@Override
	public String toString() {
		return "AccountAndCustomer [account_id=" + account_id + ", account_type=" + account_type + ", account_balance="
				+ account_balance + ", customer_id=" + customer_id + ", customer_first_name=" + customer_first_name
				+ ", customer_last_name=" + customer_last_name + ", customer_dob=" + customer_dob + "]";
	}
	
	public AccountAndCustomer(int account_id, String account_type, double account_balance, int customer_id,
			String customer_first_name, String customer_last_name, String customer_dob) {
		super();
		this.account_id = account_id;
		this.account_type = account_type;
		this.account_balance = account_balance;
		this.customer_id = customer_id;
		this.customer_first_name = customer_first_name;
		this.customer_last_name = customer_last_name;
		this.customer_dob = customer_dob;
	}
	
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
	

}
