package com.mintapple.zm.service;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.mintapple.Entity.Customer;


public interface CustomerOwnRepository extends Repository<Customer, Long>{
	@Query(value="select id from customer b where b.firstName=?1")
	List<Customer> findByFirstName(String firstName);
	List<Customer> findByFirstNameAndPincode(String firstName, String pincode);
}
