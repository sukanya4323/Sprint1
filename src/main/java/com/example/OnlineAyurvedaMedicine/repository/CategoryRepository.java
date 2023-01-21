package com.example.OnlineAyurvedaMedicine.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OnlineAyurvedaMedicine.entity.Category;

	@Repository
	public interface CategoryRepository extends JpaRepository<Category, Long> {

		Optional<Category> findByCategoryId(long id);

		

	}