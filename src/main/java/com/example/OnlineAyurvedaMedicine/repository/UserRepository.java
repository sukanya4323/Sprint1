package com.example.OnlineAyurvedaMedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OnlineAyurvedaMedicine.entity.User;

/**
 * 
 * @author Murali Krishna
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * 
	 * @param userName
	 * @return
	 */
	boolean existsByUserName(String userName);


}
