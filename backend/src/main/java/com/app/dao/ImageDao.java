package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.PropertyPicture;

public interface ImageDao extends JpaRepository<PropertyPicture, Long>{

}
