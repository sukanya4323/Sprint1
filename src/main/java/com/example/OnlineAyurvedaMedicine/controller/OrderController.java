package com.example.OnlineAyurvedaMedicine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.OnlineAyurvedaMedicine.entity.Order;
import com.example.OnlineAyurvedaMedicine.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService odServ;
	@PostMapping("/saveOrder")
	public ResponseEntity<Order>saveOrder(@RequestBody Order od) {
		Order savedOd=odServ.saveOrder(od);
		return new ResponseEntity<Order>(savedOd, HttpStatus.CREATED);
	}
	@GetMapping("/allOrders")
	public ResponseEntity<List<Order>> getAllOrders(){
		List<Order> order=odServ.getAllOrders();
		return new ResponseEntity<List<Order>>(order, HttpStatus.OK);
	}
	@GetMapping("/getOrder/{id}")
	public ResponseEntity<Optional<Order>> getOrderById(@PathVariable long id){
		Optional<Order> od=odServ.getOrderById(id);
		return new ResponseEntity<>(od, HttpStatus.OK);
	}
	@PutMapping("/updateOrder")
	public ResponseEntity<Order> updateOrder(@RequestBody Order od){
		Order upOd=odServ.updateOrder(od);
		return new ResponseEntity<>(upOd, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteOdById(@PathVariable long id){
	String msg=odServ.deleteOrderById(id);
	return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	

}
