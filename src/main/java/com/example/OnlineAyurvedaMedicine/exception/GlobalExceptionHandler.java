package com.example.OnlineAyurvedaMedicine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value=PriceException.class)
	public ResponseEntity<String> priceException(PriceException user1){
		return new ResponseEntity<String>("Shipping charge of 70/- will be charged. Add more items to make a total of 500/-.", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(value = CustomerAlreadyExistsException.class)
	public ResponseEntity<String> customerAlreadyExistsException(CustomerAlreadyExistsException user){
		return new ResponseEntity<String>("customer already exists in db. Please- try again", HttpStatus.CONFLICT);
				
	}
	
	@ExceptionHandler(value = UserAlreadyExistsException.class)
	public ResponseEntity<String> UserAlreadyExistsException (UserAlreadyExistsException user){
		return new ResponseEntity<String>("User already exists in database. please try again", HttpStatus.CONFLICT);
	}

}
