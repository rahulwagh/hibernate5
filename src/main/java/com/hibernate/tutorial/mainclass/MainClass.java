package com.hibernate.tutorial.mainclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.tutorial.entity.Employee;

import org.hibernate.Transaction;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure() // configures settings
															// from
															// hibernate.cfg.xml
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setId(new Long(1));
		emp.setEmployeeName("Rahul Wagh");
		emp.setEmployeeAddress("Indore, India");
		session.save(emp);
		tx.commit();
		session.close();
	}
}
