package com.car_rental3.etity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="savebooking")
public class SaveBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="car_name", nullable=false)
	private String carName;
	
	@Column(name="charge_per_km", nullable=false)
	private int chargePerKm;
	
	@Column(name="ac", nullable=false)
	private boolean AC;
	
	
	
	@Column(name="booking_period", nullable=false)
	private int bookingPeriod;
	
	@Column(name="pickup_date", nullable=false)
	private Date pickUpDate;
	
	@Column(name="drop_date", nullable=false)
	private Date dropDate;
	
	@Column(name="customer_name", nullable=false)
	private String customerName;
	
	@Column(name="customer_email", nullable=false)
	private String customerEmail;
	
	@Column(name="customer_number", nullable=false)
	private String customernumber;
	
	@Column(name="source", nullable=false)
	private String source;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="car_id")
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public void setPickupDate(Date pickUpDate) {
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
