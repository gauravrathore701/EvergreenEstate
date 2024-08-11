package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Address;

public interface AddressDao extends JpaRepository<Address, Long> {
	
	List<Address> findByCity(String city);
	
}
