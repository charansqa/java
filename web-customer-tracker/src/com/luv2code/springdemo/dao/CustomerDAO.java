package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {

	
	public List<Customer> getCustomers();    //here customer is the entity class name
	
}
