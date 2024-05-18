package com.springmvcmvn;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.Employee;
import com.dao.EmployeeDAOImpl;

@Controller
public class EmployeeController {
	
	ClassPathXmlApplicationContext ac;
	EmployeeDAOImpl ed;
	
	//Calling the object
	public EmployeeController(){
		 ac = new ClassPathXmlApplicationContext("beans.xml");
		 ed = (EmployeeDAOImpl) ac.getBean("edaoi");
	}
	
	
	@RequestMapping("/")
	public String indexPage() {
		return "homePage";
	}
	
	
	//Call the object from EmployeeDAOImpl and insert the data.
	@RequestMapping("dataInsert")
	public String insert(@RequestParam("empid") int empid, 
			   @RequestParam("ename") String ename,
			   @RequestParam("jobrole") String jobrole,
			   @RequestParam("dept") String dept,
			   @RequestParam("deptid") int deptid){
		
		Employee e = new Employee(empid, ename, jobrole, dept, deptid);
		String s = ed.insert(e);
		//It goes to  successInsert.jsp file(half half)
		return s+"Insert";	
	}
	
	
	//Call the object and delete the data.
	@RequestMapping("delete")
	public String delete(@RequestParam("empid") int empid) {
		String s = ed.delete(empid);
		//it goes to deletedEmployee.jsp file.
		return s+"Employee";
		
	}
}
