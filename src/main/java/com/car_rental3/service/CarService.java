package com.car_rental3.service;

import java.util.List;

import com.car_rental3.payload.CarDto;

public interface CarService {

	List<CarDto> getAllData();

	CarDto findCar(long id);

	List<CarDto> getAllCars();

	void saveOneCar(CarDto carDto);

	void updateCar(String ac, long id);

	void deleteCarById(long id);

	List<CarDto> getBookedCars();

	List<CarDto> getAllNotBookedCars();
	
	

}
