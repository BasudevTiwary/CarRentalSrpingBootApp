package com.car_rental3.service;

import java.util.List;

import com.car_rental3.etity.Customer;
import com.car_rental3.payload.CustomerDto;

public interface CustomerService {

	void saveOneCustomer(CustomerDto customerDto);

	boolean userAuthenicate(String username, String password);

	CustomerDto getUser(String username);

	List<CustomerDto> listOfUsers();

	Customer getUserByEmail(String email);

	void updateOneUser(Customer user, long mobile, String address);

	void deleteUser(String email);

	void blockUser(String username);

}
