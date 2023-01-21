package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Customer;
import com.example.OnlineAyurvedaMedicine.exception.CustomerAlreadyExistsException;
import com.example.OnlineAyurvedaMedicine.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository custRepo;
	@Override
	public Customer saveCustomer(Customer cust) throws CustomerAlreadyExistsException {
		if(custRepo.existsByCustomerName(cust.getCustomerName()))
			throw new CustomerAlreadyExistsException();
		
		Customer savedCust=custRepo.save(cust);
		return savedCust;
		
	}
	
	@Override
	public List<Customer> getAllCustomers(){
		List<Customer>customers=custRepo.findAll();
		return customers;
	}
	
	@Override
	public Optional<Customer> getCustomerByCustomerId(long customerId) {
		Optional<Customer>cust=custRepo.findByCustomerId(customerId);
		return cust;
	}
	
	@Override
	public String deleteCustomerByCustomerId(long customerId) {
		Optional<Customer> cust=custRepo.findById(customerId);
		if(cust.isPresent()) {
			custRepo.deleteById(customerId);
		return "deleted successfully";
		}
		return "id doesn't exists";
	}
	
	@Override
	public Customer updateCustomer(Customer cust) {
		Customer upcust=custRepo.save(cust);
		return upcust;
	}

	@Override
	public Customer saveCustomerEntity(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}


}
