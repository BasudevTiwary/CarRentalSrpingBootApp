package com.car_rental3.payload;

import java.sql.Date;

import com.car_rental3.etity.Car;
import com.car_rental3.etity.Customer;

public class SaveBookingDto {

	private String carName;

	private int chargePerKm;

	private boolean AC;

	private int bookingPeriod;

	private Date pickUpDate;

	private Date dropDate;

	private String customerName;

	private String customerEmail;

	private String customernumber;

	private String source;

	private Customer customer;
	
	private Car car;
	
	

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getChargePerKm() {
		return chargePerKm;
	}

	public void setChargePerKm(int chargePerKm) {
		this.chargePerKm = chargePerKm;
	}

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	
	public int getBookingPeriod() {
		return bookingPeriod;
	}

	public void setBookingPeriod(int bookingPeriod) {
		this.bookingPeriod = bookingPeriod;
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public Date getDropDate() {
		return dropDate;
	}

	public void setDropDate(Date dropDate) {
		this.dropDate = dropDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
