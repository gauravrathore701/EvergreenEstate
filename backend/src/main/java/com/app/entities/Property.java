package com.app.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "properties")
public class Property extends BaseEntity {

	@Column(length = 50)
	private String title;
	
	@Column
	private String description;
	
	@Column
	private double price;
	
	@Column
	private double propertyArea;
	
	@Column
	@Enumerated(EnumType.STRING)
	private PropertyType propertyType;
	
	@Column
	private int bedrooms;
	
	@Column
	private int bathrooms;
	
	@Column
	private int isSold = 0;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private Address address;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "properties", fetch = FetchType.EAGER)
	private Set<Tag> tags = new HashSet<>();
}
