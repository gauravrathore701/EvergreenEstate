package com.app.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.dto.SaveUserDto;
import com.app.dto.UpdateUserDto;
import com.app.entities.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String addNewUser(SaveUserDto user) {

		User existingUser = new User();


		if (userDao.findByEmail(user.getEmail()) != null)
			return "User with this email already exists...";
	
//			existingUser.setFirstName(user.getFirstName());
//			existingUser.setLastName(user.getLastName());
//			existingUser.setEmail(user.getEmail());
//			existingUser.setPassword(user.getPassword());
//			existingUser.setDob(user.getDob());
//			existingUser.setPhoneNumber(user.getPhoneNumber());
//			existingUser.setCity(user.getCity());
//			existingUser.setState(user.getState());
//			existingUser.setUserName(user.getUserName());
			
			existingUser = modelMapper.map(user, User.class);
		
		userDao.save(existingUser);
		return "User Registered...";
	}

	@Override
	public String updateUser(UpdateUserDto user, Long userId) {
		
		Optional<User> userFound = userDao.findById(userId);
		User existingUser = userFound.get();
		
//		if(user.getEmail() !=  existingUser.getEmail())
//			return "Email can't be modified";
			
		
		
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
//		existingUser.setEmail(user.getEmail());
//		existingUser.setPassword(user.getPassword());
//		existingUser.setDob(user.getDob());
//		existingUser.setPhoneNumber(user.getPhoneNumber());
		existingUser.setCity(user.getCity());
		existingUser.setState(user.getState());
//		existingUser.setUserName(user.getUserName());
		
		userDao.save(existingUser);
		
		return "updated";
	}

}
