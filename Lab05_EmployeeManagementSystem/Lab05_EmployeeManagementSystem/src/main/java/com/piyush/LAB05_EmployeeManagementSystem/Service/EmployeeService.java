package com.piyush.LAB05_EmployeeManagementSystem.Service;

import java.util.List;

import com.piyush.LAB05_EmployeeManagementSystem.Entity.Employee;

public interface EmployeeService {
	
	
	Employee saveEmployee(Employee employee);
	
	List<Employee>findAll();
	
	public void deleteByID(long id);
	
	Employee findById(long id);
	
	Employee updateById(Employee employee);

}
