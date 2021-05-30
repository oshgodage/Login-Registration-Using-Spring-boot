package com.loginForm.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginForm.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//This is method ,Retrieve the information according to the user email from the database
	User findByEmail(String email);
}
