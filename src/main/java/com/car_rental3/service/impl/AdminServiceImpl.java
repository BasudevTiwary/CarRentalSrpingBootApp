package com.car_rental3.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car_rental3.Repository.AdminRepository;
import com.car_rental3.etity.Admin;
import com.car_rental3.payload.AdminDto;
import com.car_rental3.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminRepo;

	
	@Override
	public void saveOneAdmin(AdminDto adminDto) {
		
		Admin admin = mapToAdmin(adminDto);
		adminRepo.save(admin);
	}
	
	public Admin mapToAdmin(AdminDto adminDto){
		
		Admin admin= new Admin();
		
		admin.setFirstName(adminDto.getFirstName());
		admin.setLastName(adminDto.getLastName());
		admin.setEmail(adminDto.getEmail());
		admin.setAddress(adminDto.getAddress());
		admin.setAdminName(adminDto.getAdminName());
		admin.setPassword(adminDto.getPassword());
		
		return admin;
	}

	@Override
	public boolean adminAuthenicate(String adminName, String password) {
		List<Object> admin = adminRepo.findByAdminNameAndPassword(adminName, password);
		Iterator<Object> iterator = admin.iterator();
		if(iterator.hasNext()) {
			
			return true;
		}
		return false;
	}

	
}
