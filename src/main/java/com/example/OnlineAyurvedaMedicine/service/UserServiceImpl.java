package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.User;
import com.example.OnlineAyurvedaMedicine.exception.UserAlreadyExistsException;
import com.example.OnlineAyurvedaMedicine.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;

	@Override
	public User saveUser(User user) throws UserAlreadyExistsException {
		if (userRepo.existsByUserName(user.getUserName()))
			throw new UserAlreadyExistsException();
		User savedUser = userRepo.save(user);
		return savedUser;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> user = userRepo.findAll();
		return user;
	}
	
	@Override
	public Optional<User> getUserById(long userId) {
		Optional<User> user = userRepo.findById(userId);
		return user;
	}
	
	@Override
	public User updateUser(User user) {
		User upuser = userRepo.save(user);
		return upuser;
	}
	
	@Override
	public String deleteById(long userId) {
		userRepo.deleteById(userId);
		return "delete successfully";
	}
}
