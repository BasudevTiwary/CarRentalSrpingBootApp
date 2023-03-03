package com.car_rental3.service.impl;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car_rental3.Repository.CustomerRepository;
import com.car_rental3.Repository.SaveBookingRepository;
import com.car_rental3.etity.Car;
import com.car_rental3.etity.Customer;
import com.car_rental3.etity.SaveBooking;
import com.car_rental3.payload.CustomerDto;
import com.car_rental3.payload.SaveBookingDto;
import com.car_rental3.service.SaveBookingService;

@Service
public class SaveBookingServiceImpl implements SaveBookingService {
	
	@Autowired
	SaveBookingRepository saveBookingRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	

//	@Override
//	public void saveUserBooking(SaveBookingDto saveBookingDto) {
//		SaveBooking ob2 = mapToEntity(saveBookingDto);
//		saveBookingRepo.save(ob2);
//	}
	
	public SaveBooking mapToEntity(SaveBookingDto saveBookingDto){
		
		SaveBooking ob1= new SaveBooking();
		ob1.setCarName(saveBookingDto.getCarName());
		ob1.setAC(saveBookingDto.isAC());
		ob1.setChargePerKm(saveBookingDto.getChargePerKm());
		ob1.setBookingPeriod(saveBookingDto.getBookingPeriod());
		ob1.setCustomerEmail(saveBookingDto.getCustomerEmail());
		ob1.setCustomerName(saveBookingDto.getCustomerName());
		ob1.setCustomernumber(saveBookingDto.getCustomernumber());
		ob1.setPickupDate(saveBookingDto.getPickUpDate());
		ob1.setDropDate(saveBookingDto.getDropDate());
		ob1.setSource(saveBookingDto.getSource());
		
		
		return ob1;
		
	}

//	@Override
//	public void saveUserBooking(SaveBookingDto saveBookingDto, Customer userData) {
//		
//		
//		SaveBooking saveBooking = mapToEntity(saveBookingDto);
//		saveBooking.setCustomer(userData);
//		
//		saveBookingRepo.save(saveBooking);
//		
//	}

	@Override
	public void saveUserBooking(SaveBookingDto saveBookingDto, Customer userData, Car car) {
		SaveBooking saveBooking = mapToEntity(saveBookingDto);
		saveBooking.setCustomer(userData);
		saveBooking.setCar(car);
		
		saveBookingRepo.save(saveBooking);
		
	}
	
	@Override
	public List<SaveBookingDto> getTransactionReport(){
		
		List<SaveBooking> findAll = saveBookingRepo.findAll();
		List<SaveBookingDto> collect = findAll.stream().map(x->mapToSaveBookingDto(x)).collect(Collectors.toList());
		
		
		return collect;
	}
	
	
	public SaveBookingDto mapToSaveBookingDto(SaveBooking saveBooking){
		
		SaveBookingDto saveBookingDto = new SaveBookingDto();
		
		
		saveBookingDto.setCarName(saveBooking.getCarName());
		saveBookingDto.setChargePerKm(saveBooking.getChargePerKm());
		saveBookingDto.setBookingPeriod(saveBooking.getBookingPeriod());
		saveBookingDto.setPickUpDate(saveBooking.getPickUpDate());
		saveBookingDto.setDropDate(saveBooking.getDropDate());
		saveBookingDto.setCustomerName(saveBooking.getCustomerName());
		saveBookingDto.setCustomerEmail(saveBooking.getCustomerEmail());
		saveBookingDto.setCustomernumber(saveBooking.getCustomernumber());
		saveBookingDto.setSource(saveBooking.getSource());
		saveBookingDto.setCustomer(saveBooking.getCustomer());
		saveBookingDto.setCar(saveBooking.getCar());
		
		return saveBookingDto;
	}

	

}
