package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "property_pictures")
public class PropertyPicture extends BaseEntity{

	@Column
	private String imageLink;
	
	
}
