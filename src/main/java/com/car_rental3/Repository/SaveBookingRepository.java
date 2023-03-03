package com.car_rental3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.car_rental3.etity.SaveBooking;

public interface SaveBookingRepository extends JpaRepository<SaveBooking, Long> {

	
	
}
