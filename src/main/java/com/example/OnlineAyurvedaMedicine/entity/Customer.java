package com.example.OnlineAyurvedaMedicine.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="Customer_ID")
		private long customerId;
		@Column(nullable=false, length=10)
		private String customerName;
		private String password;
		private String orders;
		
		@OneToMany(cascade=CascadeType.ALL)
		@JoinTable(name="Cust_Od",joinColumns=@JoinColumn(name="Customer_ID"), inverseJoinColumns=@JoinColumn(name="Order_ID"))
		private List<Order> od;

}
