package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Tag;
import com.app.services.TagService;

@RestController
@CrossOrigin
@RequestMapping("/tag")
public class TagController {

	@Autowired
	private TagService tagService;
	
	@GetMapping("/all")
	public ResponseEntity<?> findAllTags(){
		return ResponseEntity.ok(tagService.findAllTags());
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addNewTag(@RequestBody Tag tag){
		return ResponseEntity.ok(tagService.addNewTag(tag));
	}
	
}
