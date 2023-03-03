package com.car_rental3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.car_rental3.Repository.CarRepository;
import com.car_rental3.Repository.CustomerRepository;
import com.car_rental3.etity.Car;
import com.car_rental3.etity.Customer;
import com.car_rental3.payload.CustomerDto;
import com.car_rental3.payload.SaveBookingDto;
import com.car_rental3.service.SaveBookingService;

@Controller
public class SaveBookingController {
	
	@Autowired
	SaveBookingService saveBookingService;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	CarRepository carRepo;
	
	@RequestMapping(value="/saveBooking", method=RequestMethod.POST)
	public String saveBooking(@ModelAttribute("SaveBookingDto") SaveBookingDto saveBookingDto, @RequestParam("user") String user, Model model) {
		
		int chargePerKm = saveBookingDto.getChargePerKm();
		int bookingPeriod = saveBookingDto.getBookingPeriod();
		int fair=chargePerKm*bookingPeriod;
		model.addAttribute("fair", fair);
		
		model.addAttribute("username",saveBookingDto.getCustomerName() );
		model.addAttribute("status", saveBookingDto);
		
		String carname = saveBookingDto.getCarName();
		System.out.println(carname);
		Car car = carRepo.findByName(carname);
		
		Customer UserData = customerRepo.findByUsername(user);
		saveBookingService.saveUserBooking(saveBookingDto,UserData,car);
		return "bookedStatus";
	}
	
	@RequestMapping("/confirmation")
	public String confirmationBooking(@RequestParam("username") String username, Model model) {
		
		System.out.println(username);
		
		model.addAttribute("msg", username);
		
		return "acknowledgePage";
	}

}
