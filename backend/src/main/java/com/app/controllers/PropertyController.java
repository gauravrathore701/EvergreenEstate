package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SavePropertyDto;
import com.app.services.PropertyService;

@RestController
@CrossOrigin
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	private PropertyService propertyService;
	
	@PostMapping("/{userId}")
	public ResponseEntity<?> addProperty(@RequestBody SavePropertyDto property, @PathVariable Long userId){
		return ResponseEntity.ok(propertyService.addNewProperty(property, userId));
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllProperties(){
		return ResponseEntity.ok(propertyService.getAllProperties());
	}
}
