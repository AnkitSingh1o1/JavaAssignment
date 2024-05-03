package com.exception;

public class InsufficientFundException extends Exception{

	private static final long serialVersionUID = 1L;
	
	String message;
	
	//Constructor
	public InsufficientFundException(String message){
		this.message = message;
	}
	
	//getter
	public String getMessage() {
		return message;
	}

}
