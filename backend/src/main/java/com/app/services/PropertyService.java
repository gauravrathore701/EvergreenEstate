package com.app.services;

import java.util.List;

import com.app.dto.SavePropertyDto;
import com.app.entities.Property;

public interface PropertyService {

	String addNewProperty(SavePropertyDto property, Long userId);
	
	List<Property> getAllProperties();
	
}
