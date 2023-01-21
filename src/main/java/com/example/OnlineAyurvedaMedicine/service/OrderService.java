package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Order;

@Service
public interface OrderService {

	Order saveOrder(Order od);

	List<Order> getAllOrders();

	Order updateOrder(Order od);

	String deleteOrderById(long orderId);

	Optional<Order> getOrderById(long orderId);
	
}
