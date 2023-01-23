package com.example.OnlineAyurvedaMedicine;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.OnlineAyurvedaMedicine.repository.CustomerRepository;
import com.example.OnlineAyurvedaMedicine.service.CustomerService;
import com.example.OnlineAyurvedaMedicine.service.CustomerServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {
@Mock private CustomerRepository customerRepo;
	
	private CustomerService customerService;
	
	@BeforeEach void setUp()
    {
        this.customerService = new CustomerServiceImpl(customerRepo);
    }
	
	@Test void getAllCustomer()
    {
        customerService.getAllCustomers();
        verify(customerRepo).findAll();
    }
	
	@Test void getCustomerById()
	{
		customerService.getCustomerByCustomerId(402);
		verify(customerRepo).findByCustomerId((long) 402);
	}

	@Test void deleteCustomerById()
	{
		customerService.getCustomerByCustomerId(406);
		verify(customerRepo).findByCustomerId((long) 406);
	}

}
