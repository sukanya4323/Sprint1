package com.example.OnlineAyurvedaMedicine.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineAyurvedaMedicine.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

	boolean existsByCustomerName(String customerName);

	Optional<Customer> findByCustomerId(long customerId);
	
	

}
