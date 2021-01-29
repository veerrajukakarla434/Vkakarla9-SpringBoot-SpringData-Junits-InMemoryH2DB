package com.vkakarla.springboot.data.inmemory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vkakarla.springboot.data.inmemory.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee getEmbloyeById(Long empId);
}
