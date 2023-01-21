package com.example.OnlineAyurvedaMedicine.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineAyurvedaMedicine.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	boolean existsByUserName(String userName);


}
