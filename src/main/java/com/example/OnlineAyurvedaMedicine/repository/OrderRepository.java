package com.example.OnlineAyurvedaMedicine.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineAyurvedaMedicine.entity.Order;

public interface OrderRepository extends JpaRepository<Order , Long> {

	Optional<Order> findByOrderId(long orderId);

	void deleteByOrderId(long orderId);
	

}
