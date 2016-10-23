package com.mintapple.zm.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.mintapple.Entity.Customer;


public interface CustomerService {
	public List<Customer> findAll();
	public void saveCustomer(Customer customer);
	
	@Cacheable ("customers")
	public Customer findOne(String id);
	public void delete(String id);
	public List<Customer> findByName(String name);
	public List<Customer> findByNameAndPincode(String name, String pincode);
	public List<Customer> findByAddress(String address);
	List<Customer> findByNameAndStreet(String name, String street);
	List<Customer> findByNameMatch(String name);
	List<Customer> findByNamedAndCountry(String name, String country);
	
}
