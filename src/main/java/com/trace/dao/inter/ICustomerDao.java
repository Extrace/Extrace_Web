package com.trace.dao.inter;

import java.util.List;

import com.trace.entity.Customer;

public interface ICustomerDao {
	public void addCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean delCustomerById(int id);
	public Customer getCustomerById(int id);
	public List<Customer> getCustomers();
}
