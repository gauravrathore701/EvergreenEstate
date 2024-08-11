package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.TagDao;
import com.app.entities.Tag;

@Service
@Transactional
public class TagServiceImpl  implements TagService{

	@Autowired
	private TagDao tagDao;

	@Override
	public String addNewTag(Tag tag) {
		
		if(tag == null)
			return "Incorrect Values";
		
		tagDao.save(tag);
		return "Tag Added...";
	}

	@Override
	public List<Tag> findAllTags() {
		return tagDao.findAll();
	}
	
	
	
	
}
