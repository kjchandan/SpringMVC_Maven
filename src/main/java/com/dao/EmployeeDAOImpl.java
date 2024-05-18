package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Entity.Employee;


@Component("edaoi")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	Session session;
	

	@Autowired
	EmployeeDAOImpl(@Qualifier("sessionfactory") SessionFactory sf) {
		
		session = sf.openSession();
		System.out.println("Session established");
	}
	
	//Insert data to database.
	@Override
	public String insert(Employee e) {
		System.out.println("Insert method is called from employeeDAOImpl");
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();
		return "success";
	}

	//Delete based on ID.
	@Override
	public String delete(int empid) {
		Transaction t = session.beginTransaction();
		Employee e = session.get(Employee.class, empid);
		session.delete(e);
		t.commit();
		return "deleted";
	}

}
