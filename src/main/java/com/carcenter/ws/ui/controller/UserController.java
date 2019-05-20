package com.carcenter.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.carcenter.ws.service.UserService;
import com.carcenter.ws.shared.dto.UserDto;
import com.carcenter.ws.ui.model.request.UserDetailsRequestModel;
import com.carcenter.ws.ui.model.response.UserRest;

// all operations you have to do with users
@RestController
@RequestMapping(value="/user") // http://localhost:8080/user
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping	
	public String getUser() {
		return "get user was called";
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto); // src obj -> target obj
		UserDto createdUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		
		return returnValue;
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
	
}
