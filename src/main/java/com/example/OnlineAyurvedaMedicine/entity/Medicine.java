package com.example.OnlineAyurvedaMedicine.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 
 * @author Tentu Sindhu
 *
 */
@Entity
@Data
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Medicine_ID")
	private long medicineId;
	@Size(min=6)
	private String medicineName;
	@NotNull
	private LocalDate expiryDate;
	@NotNull
	private double price;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cat_med")
	private Category cat;

}
