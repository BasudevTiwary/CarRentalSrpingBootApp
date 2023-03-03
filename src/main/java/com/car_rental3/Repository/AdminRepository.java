package com.car_rental3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car_rental3.etity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	List<Object> findByAdminNameAndPassword(String adminName,String password);
}
