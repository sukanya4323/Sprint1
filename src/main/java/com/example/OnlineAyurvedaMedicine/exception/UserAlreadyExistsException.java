package com.example.OnlineAyurvedaMedicine.exception;

public class UserAlreadyExistsException extends Exception {
	
	private String msg;
	
	public UserAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
 
	}
	
	public UserAlreadyExistsException() {
		super();
	}


}
