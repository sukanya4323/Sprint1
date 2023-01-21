package com.example.OnlineAyurvedaMedicine.exception;

public class CustomerAlreadyExistsException extends Exception{
	
private String msg;
	
	public CustomerAlreadyExistsException(String msg) {
		super();
		this.msg = msg;
	}


	public CustomerAlreadyExistsException() {
		super();
	}

}
