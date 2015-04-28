package com.trace.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.trace.entity.Customer;
import com.trace.service.inter.ICustomerService;

@Controller
@RequestMapping(value = "/customer")
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

	@RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Customer> getCustomersJson() {
		List<Customer> lcustomer = customerService.getCustomers();
		return creatListjson(lcustomer);
	}

	private List<Customer> creatListjson(List<Customer> lcustomer) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<Customer>();
		for (Customer c : lcustomer) {
			customers.add(c);
		}
		return customers;
	}

}
