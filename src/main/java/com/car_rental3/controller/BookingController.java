package com.car_rental3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.car_rental3.payload.CarDto;
import com.car_rental3.payload.CustomerDto;
import com.car_rental3.service.CarService;
import com.car_rental3.service.CustomerService;

@Controller
public class BookingController {
	
	@Autowired
	CarService carService;
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/carBooking")
	public String bookingCar(@RequestParam("id") long id,@RequestParam("username") String username, Model model) {
		
		
		CarDto findCar = carService.findCar(id);
		CustomerDto user = customerService.getUser(username);
		
//		System.out.println(user.getFirstName());
//		System.out.println(user.getEmail());
//		System.out.println(user.getLastName());
//		System.out.println(user.getAddress());
//		System.out.println(user.getMobile());
//		System.out.println(user.getUsername());
//		
		model.addAttribute("user",user);
		model.addAttribute("car", findCar);
		return "reservation";
	}
	
	
}
