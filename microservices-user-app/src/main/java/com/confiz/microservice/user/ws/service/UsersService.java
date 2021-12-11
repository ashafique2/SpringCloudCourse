package com.confiz.microservice.user.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.confiz.microservice.user.ws.dtos.UserDto;


public interface UsersService extends UserDetailsService{
	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	UserDto getUserByUserId(String userId);

}
