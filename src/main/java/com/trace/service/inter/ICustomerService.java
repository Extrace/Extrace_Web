package com.trace.service.inter;

import java.util.List;

import com.trace.entity.Customer;
/**
 * 客户服务接口
 * @author Eamonn
 *
 */
public interface ICustomerService {
	/**
	 * 新增客户
	 * @param customer
	 */
	public void addCustomer(Customer customer);
	/**
	 * 更新客户
	 * @param customer
	 */
	public boolean updateCustomer(Customer customer);
	/**
	 * 删除用户
	 * @param id
	 */
	public boolean delCustomerById(int id);
	/**
	 * 查询单个用户
	 * @param id
	 * @return
	 */
	public Customer getCustomerById(int id);
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<Customer> getCustomers();
}
