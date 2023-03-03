package com.car_rental3.payload;

import java.util.List;

import com.car_rental3.etity.Car;
import com.car_rental3.etity.SaveBooking;

import lombok.Data;

@Data
public class CustomerDto {

	private String firstName;

	private String lastName;

	private String email;

	private long mobile;

	private String address;

	private String username;

	private String password;

	private List<SaveBooking> saveBookings;

	public List<SaveBooking> getSaveBooking() {
		return saveBookings;
	}

	public void setSaveBooking(List<SaveBooking> saveBookings) {
		this.saveBookings = saveBookings;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
