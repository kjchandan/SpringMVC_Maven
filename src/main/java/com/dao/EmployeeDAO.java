package com.dao;

import com.Entity.Employee;

public interface EmployeeDAO {
	
	String insert(Employee e);
	String delete(int empid);
}
