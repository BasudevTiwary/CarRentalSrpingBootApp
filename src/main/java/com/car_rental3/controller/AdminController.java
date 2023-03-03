package com.car_rental3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.car_rental3.Repository.CustomerRepository;
import com.car_rental3.etity.Customer;
import com.car_rental3.payload.AdminDto;
import com.car_rental3.payload.CarDto;
import com.car_rental3.payload.CustomerDto;
import com.car_rental3.payload.SaveBookingDto;
import com.car_rental3.service.AdminService;
import com.car_rental3.service.CarService;
import com.car_rental3.service.CustomerService;
import com.car_rental3.service.SaveBookingService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@Autowired
	CustomerService customerService;

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	CarService carService;
	
	@Autowired
	SaveBookingService saveBookingService;

	@RequestMapping("/adminlogin")
	public String adminLogin() {

		return "adminPage";
	}

	@RequestMapping("/adminRegister")
	public String adminRegisterPage() {

		return "adminRegister";
	}

	@RequestMapping("/admin_login")
	public String adminLoginPage() {

		return "adminlogin";
	}

	@RequestMapping("/saveAdmin")
	public String saveAdmin(@ModelAttribute("saveAdmin") AdminDto adminDto) {

		adminService.saveOneAdmin(adminDto);
		return "adminlogin";
	}

	@RequestMapping("/adminAuth")
	public String userAuth(@RequestParam("adminName") String adminName, @RequestParam("password") String password,
			Model model) {

		boolean adminAuthenicate = adminService.adminAuthenicate(adminName, password);

		if (adminAuthenicate) {

			return "allList";

		} else {
			model.addAttribute("msg", "invalid addminname or password");
			return "adminlogin";
		}

	}

	@RequestMapping("/userList")
	public String customerList(Model model) {

		List<CustomerDto> users = customerService.listOfUsers();
		model.addAttribute("users", users);

		return "allUsers";
	}

	@RequestMapping("/update")
	public String updateUser(@RequestParam("uName") String username, Model model) {

		CustomerDto user = customerService.getUser(username);

		model.addAttribute("customer", user);

		return "updateUser";
	}

	@RequestMapping("/updateUser")
	public String updateUser(@RequestParam("mobile") long mobile, @RequestParam("address") String address,
			@RequestParam("email") String email, Model model) {

		Customer user = customerService.getUserByEmail(email);

		customerService.updateOneUser(user, mobile, address);

		List<CustomerDto> users = customerService.listOfUsers();
		model.addAttribute("users", users);

		return "allUsers";
	}

	@RequestMapping("/delete")
	public String deleteUser(@RequestParam("email") String email, Model model) {

		customerService.deleteUser(email);
		List<CustomerDto> users = customerService.listOfUsers();
		model.addAttribute("users", users);

		return "allUsers";
	}

	@RequestMapping("/addNewUser")
	public String addNewUser() {

		return "addNewUser";
	}
	
	@RequestMapping("/addOneNewUser")
	public String saveOneUser(@ModelAttribute("customerDto") CustomerDto customerDto,Model model) {
		
		customerService.saveOneCustomer(customerDto);
		List<CustomerDto> users = customerService.listOfUsers();
		model.addAttribute("users", users);

		return "allUsers";
		
	}

	@RequestMapping("/addCar")
	public String addCar() {

		return "addCars";
	}

	@RequestMapping("/saveCar")
	public String saveCar(@ModelAttribute("carDto") CarDto carDto,Model model) {

		System.out.println(carDto.getAc());
		carService.saveOneCar(carDto);
		List<CarDto> allCars = carService.getAllCars();

		model.addAttribute("allCars", allCars);
		return "admin_all_cars";
	}

	@RequestMapping("/carList")
	public String carList(Model model) {

		List<CarDto> allCars = carService.getAllCars();

		model.addAttribute("allCars", allCars);
		return "admin_all_cars";
	}

	@RequestMapping("/updateCar")
	public String upDateCar(@RequestParam("editCar") long id, Model model) {

		CarDto findCar = carService.findCar(id);

		model.addAttribute("car", findCar);

		return "updateCar";

	}

	@RequestMapping("/updateOneCar")
	public String UpdateOneCar(@RequestParam("Ac") String Ac, @RequestParam("id") long id,Model model) {
		carService.updateCar(Ac, id);
		List<CarDto> allCars = carService.getAllCars();

		model.addAttribute("allCars", allCars);
		return "admin_all_cars";
	}
	
	@RequestMapping("/deleteCar")
	public String deleteCar(@RequestParam("delCar") long id,Model model) {
		carService.deleteCarById(id);
		List<CarDto> allCars = carService.getAllCars();

		model.addAttribute("allCars", allCars);
		return "admin_all_cars";
	}
	
	@RequestMapping("/bookedAvailCars")
	public String Cars(Model model) {
		List<CarDto> bookedCars = carService.getBookedCars();
		
		model.addAttribute("bookedCars", bookedCars);
		
		return "allCars";
	}
	@RequestMapping("/bookedCars")
	public String AllBookedCars(Model model) {
		List<CarDto> bookedCars = carService.getBookedCars();
		
		model.addAttribute("bookedCars", bookedCars);
		
		return "bookedCars";
	}

	@RequestMapping("/notBookedCars")
	public String AllNotBookedCars(Model model) {
		List<CarDto> NotbookedCars = carService.getAllNotBookedCars();
		
		model.addAttribute("NotbookedCars", NotbookedCars);
		
		return "notBookedCars";
	}
	
	@RequestMapping("/transcation")
	public String getTransaction(Model model) {
		List<SaveBookingDto> transactionReport = saveBookingService.getTransactionReport();
		
		model.addAttribute("transaction", transactionReport);
		
		return "transaction";
	}
	@RequestMapping("/blockUser")
	public String blockUser(@RequestParam("block") String username,Model model) {
		
		customerService.blockUser(username);
		
		List<CustomerDto> users = customerService.listOfUsers();
		model.addAttribute("users", users);

		return "allUsers";
	}
}
