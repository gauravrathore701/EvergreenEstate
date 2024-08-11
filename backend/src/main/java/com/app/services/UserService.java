package com.app.services;

import com.app.dto.SaveUserDto;
import com.app.dto.UpdateUserDto;
import com.app.entities.User;

public interface UserService {

	String addNewUser(SaveUserDto user);
	
	String updateUser(UpdateUserDto user, Long userId);
	
}
