package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Customer;
import com.example.OnlineAyurvedaMedicine.exception.CustomerAlreadyExistsException;


@Service
public interface CustomerService {
	
	Customer saveCustomer(Customer cust) throws CustomerAlreadyExistsException;
	
	List<Customer> getAllCustomers();

	Customer saveCustomerEntity(Customer cust);

	Customer updateCustomer(Customer cust);

	Optional<Customer> getCustomerByCustomerId(long customerId);

	String deleteCustomerByCustomerId(long customerId);

}
