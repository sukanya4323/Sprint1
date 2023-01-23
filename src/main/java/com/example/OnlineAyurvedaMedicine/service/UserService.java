package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;
import com.example.OnlineAyurvedaMedicine.entity.User;
import com.example.OnlineAyurvedaMedicine.exception.UserAlreadyExistsException;

public interface UserService {
	
	User saveUser(User user) throws UserAlreadyExistsException;
	
	List<User> getAllUsers();
	
	Optional<User> getUserById(long id);
	
	User updateUser(User user);
	
	String deleteById(long id);
}
