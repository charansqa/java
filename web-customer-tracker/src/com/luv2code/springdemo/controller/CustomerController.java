package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/list")
	public String listcustomers(Model theModel) {  //this model sends customer to jsp
		
		
		return "list-customers";//here is the list customer.jsp
	}
}
