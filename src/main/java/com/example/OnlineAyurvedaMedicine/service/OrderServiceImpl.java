package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.OnlineAyurvedaMedicine.entity.Order;
import com.example.OnlineAyurvedaMedicine.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository odRepo;
	
	@Override
	public Order saveOrder(Order od)  {
		Order savedOd=odRepo.save(od);
	     return savedOd;
	}

	@Override
	 public List<Order> getAllOrders(){
		 List<Order> order=odRepo.findAll();
		 return order;
	 }
	@Override
	 public Optional<Order> getOrderById(long orderId){
		 Optional<Order> od=odRepo.findByOrderId(orderId);
		 return od;
	 }
	@Override
	 public Order updateOrder(Order od) {
		Order upOd=odRepo.save(od);
		 return upOd;
	 }
	 @Override
	 public String deleteOrderById(long orderId) {
		 Optional<Order> od=odRepo.findByOrderId(orderId);
		 if(od.isPresent()) {
			 odRepo.deleteByOrderId(orderId);
			 return "deleted successfully";
		 }
		 return "id doesnot exist";
	 }
	

}
