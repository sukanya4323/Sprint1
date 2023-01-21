package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import com.example.OnlineAyurvedaMedicine.entity.Admin;
import com.example.OnlineAyurvedaMedicine.entity.Category;

public interface AdminService {
	

	 Admin saveAdmin(Admin ad);

	List<Admin> getAdmin();

	String loginAdmin(Admin ad);

	

}
