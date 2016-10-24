package com.mintapple.zm.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mintapple.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
