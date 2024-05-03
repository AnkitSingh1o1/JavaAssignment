package com.exception;

public class OverDraftLimitExcededException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	String message;
	
	//Constructor
	public OverDraftLimitExcededException(String message) {
		this.message = message;
	}
	
	//Getter
	public String getMessage() {
		return message;
	}
	

}