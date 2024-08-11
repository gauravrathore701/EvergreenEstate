package com.app.services;

import java.util.List;
import java.util.Set;

import com.app.entities.Property;

public interface SearchService {

	List<Property> searchByCityName(String cityName);
	
	Set<Property> searchByTagName(String tagName);
	
	List<Property> searchByPropertyName(String propertyName);
	
	List<Property> searchByUsername(String userName);
	
}
