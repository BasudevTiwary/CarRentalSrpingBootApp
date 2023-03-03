package com.car_rental3.service;

import java.util.List;

import com.car_rental3.etity.Car;
import com.car_rental3.etity.Customer;

import com.car_rental3.payload.SaveBookingDto;

public interface SaveBookingService {

//	void saveUserBooking(SaveBookingDto saveBookingDto);

//	void saveUserBooking(SaveBookingDto saveBookingDto, Customer userData);

	void saveUserBooking(SaveBookingDto saveBookingDto, Customer userData, Car car);

	List<SaveBookingDto> getTransactionReport();

}
