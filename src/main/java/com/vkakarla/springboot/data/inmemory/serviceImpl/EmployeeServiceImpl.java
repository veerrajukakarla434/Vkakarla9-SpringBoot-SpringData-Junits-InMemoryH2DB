package com.vkakarla.springboot.data.inmemory.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkakarla.springboot.data.inmemory.entities.Employee;
import com.vkakarla.springboot.data.inmemory.repo.EmployeeRepository;
import com.vkakarla.springboot.data.inmemory.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		
			employeeRepository.save(employee);

	}

	@Override
	public Employee getEmployeeById(long id) {
		Employee empResponse = null;
		
		empResponse = employeeRepository.getEmbloyeById(id);

		return empResponse;
	}

	
	

}
