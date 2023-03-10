package com.car_rental3.Repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.car_rental3.etity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByUsername(String username);
	
	List<Object> findByUsernameAndPassword(String username,String password);

	Customer findByEmail(String email);
	
	@Query(value="select exists (select 1 from customer where user_name= :username and password= :password)", nativeQuery=true)
	BigInteger isUser(@Param("username")String username,@Param("password") String password);

	//SELECT CASE WHEN column1 = 'value1' AND column2 = 'value2' THEN true ELSE false END AS result FROM my_table
	
}
