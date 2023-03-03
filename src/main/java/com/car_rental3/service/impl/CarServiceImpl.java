package com.car_rental3.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car_rental3.Repository.CarRepository;
import com.car_rental3.Repository.SaveBookingRepository;
import com.car_rental3.etity.Car;
import com.car_rental3.etity.SaveBooking;
import com.car_rental3.payload.CarDto;
import com.car_rental3.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepo;

	@Autowired
	SaveBookingRepository saveBookingRepo;

	@Override
	public List<CarDto> getAllData() {

		List<Car> findAll = carRepo.findAll();

		List<CarDto> collect = findAll.stream().map(x -> mapToDto(x)).collect(Collectors.toList());

		return collect;
	}

	public CarDto mapToDto(Car car) {
		CarDto dto = new CarDto();

		dto.setId(car.getId());
		dto.setName(car.getName());
		dto.setAc(car.getAc());
		dto.setChargePerKm(car.getChargePerKm());

		return dto;
	}

	@Override
	public CarDto findCar(long id) {
		Optional<Car> findById = carRepo.findById(id);
		Car car = findById.get();

		CarDto Dto = mapToDto(car);
		return Dto;
	}

	@Override
	public List<CarDto> getAllCars() {
		List<Car> cars = carRepo.findAll();

		List<CarDto> collect = cars.stream().map(x -> mapToDto(x)).collect(Collectors.toList());
		return collect;
	}

	@Override
	public void saveOneCar(CarDto carDto) {
		Car car = mapToCar(carDto);
		carRepo.save(car);

	}

	public Car mapToCar(CarDto carDto) {
		Car car = new Car();

		car.setName(carDto.getName());
		car.setAc(carDto.getAc());
		car.setChargePerKm(carDto.getChargePerKm());
		return car;
	}

	@Override
	public void updateCar(String ac, long id) {
		Optional<Car> findById = carRepo.findById(id);
		Car car = findById.get();
		car.setAc(ac);
		carRepo.save(car);
	}

	@Override
	public void deleteCarById(long id) {
		carRepo.deleteById(id);

	}

	@Override
	public List<CarDto> getBookedCars() {

		List<Car> bookedCar = carRepo.getBookedCar();

		List<CarDto> collect = bookedCar.stream().map(x -> mapToDto(x)).collect(Collectors.toList());

		return collect;
	}

	@Override
	public List<CarDto> getAllNotBookedCars() {
		List<Car> NotbookedCar = carRepo.getNotBookedCar();

		List<CarDto> collect = NotbookedCar.stream().map(x -> mapToDto(x)).collect(Collectors.toList());

		return collect;
	}

}
