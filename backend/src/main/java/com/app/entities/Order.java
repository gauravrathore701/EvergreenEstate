package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order extends BaseEntity {

	@Column
	private int propertyId;
	
	@Column
	private int orderStatus;
	
	@Column
	private int orderAmount;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "users_id")
	private User user;
}
