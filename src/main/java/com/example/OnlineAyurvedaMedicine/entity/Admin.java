package com.example.OnlineAyurvedaMedicine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Admin {
	
	@Id
	@Column(name = "Admin_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long adminId;
	
	@Column(name = "password")
	private String adminPassword;
	

}
