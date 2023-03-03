package com.car_rental3.service;

import com.car_rental3.payload.AdminDto;

public interface AdminService {

	void saveOneAdmin(AdminDto adminDto);

	boolean adminAuthenicate(String adminName, String password);

}
