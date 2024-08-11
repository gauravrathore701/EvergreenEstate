package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "address")
public class Address extends BaseEntity {

	@Column(length = 100)
	private String addressLine1;
	
	@Column(length = 100)
	private String addressLine2;
	
	@Column(length = 30)
	private String city;
	
	@Column(length = 30)
	private String district;
	
	@Column(length = 30)
	private String State;
	
	@Column(length = 6)
	private String pincode;
	
	@JsonIgnore
	@OneToOne(mappedBy = "address")
	private Property property;
}
