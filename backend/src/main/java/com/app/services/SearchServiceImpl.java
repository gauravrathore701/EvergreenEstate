package com.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AddressDao;
import com.app.dao.PropertyDao;
import com.app.dao.TagDao;
import com.app.dao.UserDao;
import com.app.entities.Address;
import com.app.entities.Property;
import com.app.entities.Tag;
import com.app.entities.User;

@Service
@Transactional
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private PropertyDao propertyDao;
	
	@Autowired
	private AddressDao addressDao;
	
	@Autowired
	private TagDao tagDao;

	@Override
	public List<Property> searchByCityName(String cityName) {
		
		List<Address> addressList = addressDao.findByCity(cityName);
		
		List<Property> propertyList = new ArrayList<>();
		
		for(Address address : addressList) {
			propertyList.add(address.getProperty());
		}
		
		return propertyList;
	}

	@Override
	public Set<Property> searchByTagName(String tagName) {
		
		Tag tag = tagDao.findByTagName(tagName);
		return tag.getProperties();
	}

	@Override
	public List<Property> searchByPropertyName(String propertyName) {
		return propertyDao.findByTitle(propertyName);
	}

	@Override
	public List<Property> searchByUsername(String userName) {
		User user = userDao.findByUserName(userName);
		
		return propertyDao.findByUser(user);
	}

	
}
