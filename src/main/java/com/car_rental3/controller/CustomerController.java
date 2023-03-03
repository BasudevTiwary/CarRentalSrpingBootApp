package com.car_rental3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.car_rental3.payload.CarDto;
import com.car_rental3.payload.CustomerDto;
import com.car_rental3.service.CarService;
import com.car_rental3.service.CustomerService;



@Controller
public class CustomerController {
	
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CarService carService;
	
	
	@RequestMapping("/loginRegister")
	public String login_register() {
		
		return "login_register";
	}
	
	
	@RequestMapping("/userregister")
	public String cust_register() {
		
		return "user_register";
	}
	
	@RequestMapping("/logincustomer")
	public String cust_login() {
		
		return "login_customer";
	}
	
	@RequestMapping("/saveUser")
	public String saveOneUser(@ModelAttribute("CustomerDto") CustomerDto customerDto, Model model) {
		
		customerService.saveOneCustomer(customerDto);
		model.addAttribute("cust",customerDto.getFirstName());
		
		return "login_customer";
	}
	
	@RequestMapping("/login")
	public String userAuth(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		
		boolean userAuthenicate = customerService.userAuthenicate(username,password);
		
		if(userAuthenicate) {
			
			List<CarDto> allData = carService.getAllData();
			
			
			model.addAttribute("username", username);
			
			model.addAttribute("cardeatils", allData);
			return "car";
			
		}
		else {
			model.addAttribute("msg", "invalid username or password");
		}
		
		
		return "login_customer";
	}
	
	
	
	
	
	
	
	
	
	
	

}
