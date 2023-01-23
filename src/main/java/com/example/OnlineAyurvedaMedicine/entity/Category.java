package com.example.OnlineAyurvedaMedicine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 
 * @author Devi
 *
 */
@Entity
@Data
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Category_ID")
	@NotNull
	private long categoryId;
	@Column(nullable=false, length=15)
	private String categoryName;

}
