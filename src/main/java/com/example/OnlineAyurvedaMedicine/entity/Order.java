package com.example.OnlineAyurvedaMedicine.entity;

import java.time.LocalDate;

import com.example.OnlineAyurvedaMedicine.exception.PriceException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 
 * @author Sukanya
 *
 */
@Entity
@Data
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Order_ID")
	private long orderId;
	@Size(min=6, message="It's a reaquired field")
	private LocalDate orderDate ;
	@NotNull
	private LocalDate dispatchDate;
	private String orderAddress;
	@NotNull
	private double totalPrice;
	public void setTotalPrice(int totalPrice) throws PriceException{
		if(totalPrice<500) {
			throw new PriceException();
		}
		this.totalPrice=totalPrice;
	}
	
}
