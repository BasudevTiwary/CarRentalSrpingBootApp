package com.car_rental3.payload;

public class CarDto{

	private long id;

	private String name;

	private long chargePerKm;

	private String Ac;

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
