package com.car_rental3.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car_rental3.Repository.CustomerRepository;
import com.car_rental3.Repository.SaveBookingRepository;
import com.car_rental3.etity.Customer;
import com.car_rental3.payload.CustomerDto;
import com.car_rental3.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	SaveBookingRepository saveRepo;
	
	@Override
	public void saveOneCustomer(CustomerDto customerDto) {
		
		Customer cust= new Customer();
		cust.setFirstName(customerDto.getFirstName());
		cust.setLastName(customerDto.getLastName());
		cust.setEmail(customerDto.getEmail());
		cust.setMobile(customerDto.getMobile());
		cust.setAddress(customerDto.getAddress());
		cust.setUsername(customerDto.getUsername());
		cust.setPassword(customerDto.getPassword());
		
		customerRepo.save(cust);
		
	}
	@Override
	public boolean userAuthenicate(String username, String password) {
		List<Object> existUsernameAndPassword = customerRepo.findByUsernameAndPassword(username, password);
		Iterator<Object> iterator = existUsernameAndPassword.iterator();
		if(iterator.hasNext()) {
			return true;
			
		}
		return false;
		
		
	
	}
	@Override
	public CustomerDto getUser(String username) {
		Customer findByUsername = customerRepo.findByUsername(username);
		
		
		CustomerDto Dto = mapToDto(findByUsername);
		
		
		return Dto;
	}
	public CustomerDto mapToDto(Customer customer) {
		CustomerDto dto= new CustomerDto();
		
		dto.setFirstName(customer.getFirstName());
		dto.setLastName(customer.getLastName());
		dto.setAddress(customer.getAddress());
		dto.setEmail(customer.getEmail());
		dto.setMobile(customer.getMobile());
		dto.setUsername(customer.getUsername());
		
		
		
		
		return dto;
	}
	@Override
	public List<CustomerDto> listOfUsers() {
		
		List<Customer> findAll = customerRepo.findAll();
		
		List<CustomerDto> collect = findAll.stream().map(x->mapToDto(x)).collect(Collectors.toList());
		return collect;
	}
	@Override
	public Customer getUserByEmail(String email) {
		
		Customer findByEmail = customerRepo.findByEmail(email);
		
		return findByEmail;
	}
	@Override
	public void updateOneUser(Customer user, long mobile, String address) {
		user.setMobile(mobile);
		user.setAddress(address);
		
		customerRepo.save(user);
		
	}
	@Override
	public void deleteUser(String email) {
		Customer customer = customerRepo.findByEmail(email);
		long id = customer.getId();
		
		customerRepo.deleteById(id);
		
	}
	@Override
	public void blockUser(String username) {
		Customer user = customerRepo.findByUsername(username);
		user.setUsername(username+"block");
		customerRepo.save(user);
		
	}
	
	


}
