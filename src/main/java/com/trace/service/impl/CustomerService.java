package com.trace.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trace.dao.inter.ICustomerDao;
import com.trace.entity.Customer;
import com.trace.service.inter.ICustomerService;

@Service
@Transactional
public class CustomerService implements ICustomerService {
	
	@Autowired
	private ICustomerDao customerDao;
	
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(customer);
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	public boolean delCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDao.delCustomerById(id);
	}

	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer c=customerDao.getCustomerById(id);
		return c;
	}

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		List<Customer> clist = customerDao.getCustomers();
		return clist;
	}

}
