package com.loginForm.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.loginForm.springboot.model.User;
import com.loginForm.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	//save user's registered data
	User save(UserRegistrationDto registrationDto);
}
