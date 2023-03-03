package com.car_rental3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car_rental3.etity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByUsername(String username);
	
	List<Object> findByUsernameAndPassword(String username,String password);

	Customer findByEmail(String email);
	
	
	
}
