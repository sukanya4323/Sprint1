package com.example.OnlineAyurvedaMedicine;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.OnlineAyurvedaMedicine.repository.UserRepository;
import com.example.OnlineAyurvedaMedicine.service.UserService;
import com.example.OnlineAyurvedaMedicine.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
	@Mock private UserRepository userRepo;
	 
	 private UserService userServ;
	 
	 @BeforeEach void setUp()
	    {
	        this.userServ = new UserServiceImpl(userRepo);
	    }
	 
	    @Test void getAllUsers()
	    {
	        userServ.getAllUsers();
	        verify(userRepo).findAll();
	    }
	    
	    @Test void getUserById()
	    {
	    	userServ.getUserById(302);
	    	verify(userRepo).findById((long) 302);
	    }
	    
	    @Test void deleteUserById()
	    {
	    	userServ.getUserById(305);
	    	verify(userRepo).findById((long) 305);
	    }

}
