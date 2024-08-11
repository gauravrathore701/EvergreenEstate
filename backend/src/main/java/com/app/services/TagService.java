package com.app.services;

import java.util.List;

import com.app.entities.Tag;

public interface TagService {

	String addNewTag(Tag tag);
	
	List<Tag> findAllTags();
	
}
