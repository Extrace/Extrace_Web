package test.testdao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.trace.entity.Customer;

public class TestCustomerDao implements TestCustomerImpl {

	/**
	 * 自动装配
	 */
	@Autowired
	private SessionFactory sessionFactory;

	// public void setSessionFactory(SessionFactory sessionFactory) {
	// this.sessionFactory = sessionFactory;
	// }

	/**
	 * 获取Session
	 * 
	 * @return
	 */

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 新增客户
	 * 
	 * @author Eamonn
	 */
	@Test
	public void addCustomer() {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setCname("bbbb");

		sessionFactory.getCurrentSession().save(customer);
	}
}
