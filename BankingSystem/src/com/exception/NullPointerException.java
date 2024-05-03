package com.exception;

public class NullPointerException  extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	String message;
	
	//Constructor
	public NullPointerException(String message) {
		this.message = message;
	}
	
	//Getter
	public String getMessage() {
		return message;
	}

}