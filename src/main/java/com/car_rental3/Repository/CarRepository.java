package com.car_rental3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.car_rental3.etity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

	Car findByName(String carname);
	
	@Query(value= "select * from car where id not in(select car_id from savebooking)" , nativeQuery=true )
	List<Car> getNotBookedCar();
	
	@Query(value="select * from car where id in (select car_id from savebooking)" , nativeQuery=true)
	List<Car> getBookedCar();
}
