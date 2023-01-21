package com.example.OnlineAyurvedaMedicine.exception;

public class PriceException extends Exception{
	private String msg1;
	public PriceException() {
		super();
	}

	public PriceException(String msg1) {
		super();
		this.msg1 = msg1;
	}

}
