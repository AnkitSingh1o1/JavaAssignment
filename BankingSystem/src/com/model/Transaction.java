package com.model;

public class Transaction {
	private int transaction_id;
	private String transaction_type;
	private double transaction_amount;
	private String transaction_date;
	private int account_id;
	
	
	//Constructor
	public Transaction(int transaction_id, String transaction_type, double transaction_amount, String transaction_date,
			int account_id) {
		super();
		this.transaction_id = transaction_id;
		this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
		this.transaction_date = transaction_date;
		this.account_id = account_id;
	}

	//Constructor
	public Transaction() {
	
	}


	//Getters and Setters
	public int getTransaction_id() {
		return transaction_id;
	}


	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}


	public String getTransaction_type() {
		return transaction_type;
	}


	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}


	public double getTransaction_amount() {
		return transaction_amount;
	}


	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}


	public String getTransaction_date() {
		return transaction_date;
	}


	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}


	public int getAccount_id() {
		return account_id;
	}


	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}


	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", transaction_type=" + transaction_type
				+ ", transaction_amount=" + transaction_amount + ", transaction_date=" + transaction_date
				+ ", account_id=" + account_id + "]";
	}
	
	
}
