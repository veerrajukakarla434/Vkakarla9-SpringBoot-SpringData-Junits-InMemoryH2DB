package com.vkakarla.springboot.data.inmemory.service;

import com.vkakarla.springboot.data.inmemory.entities.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployeeById(long id);
	
	

}
