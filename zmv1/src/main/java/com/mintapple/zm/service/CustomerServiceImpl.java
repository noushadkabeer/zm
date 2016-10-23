package com.mintapple.zm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mintapple.Entity.Customer;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerOwnRepository customerOwnRepository;

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}

	@Override
	public Customer findOne(String id) {
		// TODO Auto-generated method stub
		return customerRepository.findOne(Long.parseLong(id));
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		customerRepository.delete(Long.parseLong(id));
	}

	@Override
	public List<Customer> findByName(String name) {
		// TODO Auto-generated method stub
		return customerOwnRepository.findByFirstName(name);
	}

	@Override
	public List<Customer> findByNameAndPincode(String name, String pincode) {
		// TODO Auto-generated method stub
		return customerOwnRepository.findByFirstNameAndPincode(name, pincode);
	}

	@Override
	public List<Customer> findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByNameAndStreet(String name, String street) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByNameMatch(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByNamedAndCountry(String name, String country) {
		// TODO Auto-generated method stub
		return null;
	}

}
