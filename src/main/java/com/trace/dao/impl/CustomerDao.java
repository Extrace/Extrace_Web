package com.trace.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trace.dao.inter.ICustomerDao;
import com.trace.entity.Customer;
/**
 * 客户数据访问对象
 * @author Eamonn
 *
 */
@Repository
public class CustomerDao implements ICustomerDao {
	/**
	 *自动装配
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * 获取Session
	 * @return
	 */
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/**
	 * 新增客户
	 * @author Eamonn
	 */
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		getCurrentSession().save(customer);
	}
	
	/**
	 * 修改客户姓名
	 * @author Eamonn
	 */
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String hql="update Customer c set c.cname=?";
		Query query=getCurrentSession().createQuery(hql);
		query.setString(0, customer.getCname());
		
		return(query.executeUpdate()>0);
				
	}

	/**
	 * 通过ID删除客户
	 * @author Eamonn
	 */
	public boolean delCustomerById(int id) {
		// TODO Auto-generated method stub
		String hql="delete Customer c where c.id=?";
		Query query=getCurrentSession().createQuery(hql);
		query.setInteger(0,id);
		
		return(query.executeUpdate()>0);
		
	}

	/**
	 * 通过ID查询客户
	 * @author Eamonn
	 */
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		String hql="from Customer c where c.id=?";
		Query query = getCurrentSession().createQuery(hql);
		query.setInteger(0, id);
		Customer customer= (Customer) query.uniqueResult();
		
		return customer;
	}
	
	/**
	 * 查询所有客户
	 * @author Eamonn
	 */
	@SuppressWarnings("unchecked")
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		String hql="from Customer";
		Query query = getCurrentSession().createQuery(hql);
		
		return query.list();
	}

}
