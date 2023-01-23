package com.example.OnlineAyurvedaMedicine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 
 * @author Anton Michael Shagay
 *
 */
@Data
@Entity
public class Admin {
	
	@Id
	@Column(name = "Admin_Id")
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long adminId;
	
	@Column(name = "password")
	@NotNull
	private String adminPassword;
	

}
