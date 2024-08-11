package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Tag;
import java.util.List;


public interface TagDao extends JpaRepository<Tag, Long> {

	Tag findByTagName(String tagName);
	
	
	
}
