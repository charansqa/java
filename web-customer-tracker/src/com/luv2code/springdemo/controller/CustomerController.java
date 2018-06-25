package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;




@Controller
@RequestMapping("/customer")
public class CustomerController {

	//need to inject the customer dao
		@Autowired
		private CustomerDAO customerDAO;
		
		
	
	@RequestMapping("/list")
	public String listcustomers(Model theModel) {  //this model sends customer to jsp
		
		//get customers from the dao
				List<Customer> theCustomers = customerDAO.getCustomers();
				
				// add the customers to the model 
				theModel.addAttribute( "customers", theCustomers);
			
		
		return "list-customers";//here is the list customer.jsp
	}
}
