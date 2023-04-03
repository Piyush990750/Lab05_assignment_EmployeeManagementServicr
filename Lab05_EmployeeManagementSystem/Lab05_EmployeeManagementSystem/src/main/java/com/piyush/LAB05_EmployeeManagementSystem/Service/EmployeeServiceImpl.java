package com.piyush.LAB05_EmployeeManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.LAB05_EmployeeManagementSystem.Entity.Employee;
import com.piyush.LAB05_EmployeeManagementSystem.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	public List<Employee> findAll() {

		return employeeRepository.findAll();
	}

	public void deleteByID(long id) {
		this.employeeRepository.deleteById(id);

	}

	public Employee findById(long id) {
		return employeeRepository.findById(id).orElseThrow();

		
	}

	public Employee updateById(Employee employee) {

		return employeeRepository.save(employee);
	}

}
