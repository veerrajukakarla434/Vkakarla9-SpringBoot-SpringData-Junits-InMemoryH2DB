package com.vkakarla.springboot.data.inmemory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vkakarla.springboot.data.inmemory.entities.Employee;
import com.vkakarla.springboot.data.inmemory.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = "/saveEmployee")
	public ResponseEntity<Object> saveAllEmployees(@RequestBody Employee employee) {

		employeeService.saveEmployee(employee);
		return new ResponseEntity<Object>("Successfully Saved", HttpStatus.OK);
	}

	@GetMapping(value = "/getEmployee/empId/{empId}")
	public ResponseEntity<Object> getEmployee(@PathVariable Long empId) {

		Employee empresponse = employeeService.getEmployeeById(empId);
		return new ResponseEntity<Object>(empresponse, HttpStatus.OK);

	}

}
