package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.PropertyDao;
import com.app.dao.TagDao;
import com.app.dao.UserDao;
import com.app.dto.SavePropertyDto;
import com.app.entities.Address;
import com.app.entities.Property;
import com.app.entities.Tag;
import com.app.entities.User;

@Service
@Transactional
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	PropertyDao propertyDao;

	@Autowired
	UserDao userDao;

	@Autowired
	TagDao tagDao;

	@Override
	public String addNewProperty(SavePropertyDto property, Long userId) {

		Property newProperty = new Property();
		Address newAddress = new Address();

		Optional<User> user = userDao.findById(userId);

		newAddress.setAddressLine1(property.getAddress().getAddressLine1());
		newAddress.setAddressLine2(property.getAddress().getAddressLine2());
		newAddress.setCity(property.getAddress().getCity());
		newAddress.setDistrict(property.getAddress().getDistrict());
		newAddress.setState(property.getAddress().getState());
		newAddress.setPincode(property.getAddress().getPincode());

		newProperty.setTitle(property.getTitle());
		newProperty.setBathrooms(property.getBathrooms());
		newProperty.setAddress(newAddress);
		newProperty.setUser(user.get());

		propertyDao.save(newProperty);

		for (String tagName : property.getTagNames()) {

			Tag foundTag = tagDao.findByTagName(tagName);
			newProperty.getTags().add(foundTag);
			foundTag.getProperties().add(newProperty);
		}

		return "Property Saved";
	}

	@Override
	public List<Property> getAllProperties() {
		return propertyDao.findAll();
	}

}
