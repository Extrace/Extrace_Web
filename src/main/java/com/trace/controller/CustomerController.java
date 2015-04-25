package com.trace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.trace.entity.Customer;
import com.trace.service.ICustomerService;

@Controller
@RequestMapping(value = "/customers")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	@RequestMapping(value = "/list")
	public ModelAndView getCustomers() {
		ModelAndView model = new ModelAndView("listofcustomers");
		List<Customer> customers = customerService.getCustomers();
		model.addObject("customers", customers);
		return model;
	}

	@RequestMapping(value = "/json")
	@ResponseBody
	public List<Customer> getCustomersJson() {
		return customerService.getCustomers();
	}
}
