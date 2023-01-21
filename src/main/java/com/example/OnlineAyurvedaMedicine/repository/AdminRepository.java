package com.example.OnlineAyurvedaMedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OnlineAyurvedaMedicine.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByAdminId(long adminId);
	

}
