package com.example.OnlineAyurvedaMedicine.entity;

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
 * @author Murali Krishna
 *
 */
@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Size(min=6, message="It's a required field")
	private long userId;
	@Size(min=12)
	@NotNull
	private String userName;
	@NotNull
	private String userType;
}
