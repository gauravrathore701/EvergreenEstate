package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SaveUserDto;
import com.app.dto.UpdateUserDto;
import com.app.services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody SaveUserDto user){
		return ResponseEntity.ok(userService.addNewUser(user));
	}
	
	@PostMapping("/update/{userId}")
	public ResponseEntity<?> updateUser(@RequestBody UpdateUserDto user, Long userId){
		return ResponseEntity.ok(userService.updateUser(user, userId));
	}
	
}
