package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;
import com.example.OnlineAyurvedaMedicine.entity.Category;

public interface CategoryService {

	 Category saveCategoryEntity(Category cat);

	List<Category> getAllCategoryEntity();

	Optional<Category> getCategoryById(long id);

	String deleteCategoryById(long id);

	Category updateCategory(Category cat);
}
