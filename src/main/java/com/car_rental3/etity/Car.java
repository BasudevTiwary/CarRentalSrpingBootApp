package com.car_rental3.etity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="car_name",nullable=false)
	private String name;
	
	@Column(name="charge_per_km",nullable=false)
	private long chargePerKm;
	
	@Column(name="ac",nullable=false)
	private String Ac;
	
	
	@OneToMany(mappedBy="car")
	private List<SaveBooking> saveBookings;
	
	

	public List<SaveBooking> getSaveBookings() {
		return saveBookings;
	}

	public void setSaveBookings(List<SaveBooking> saveBookings) {
		this.saveBookings = saveBookings;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getChargePerKm() {
		return chargePerKm;
	}

	public void setChargePerKm(long chargePerKm) {
		this.chargePerKm = chargePerKm;
	}

	public String getAc() {
		return Ac;
	}

	public void setAc(String Ac) {
		this.Ac = Ac;
	}

	

	
	
	

	
}
