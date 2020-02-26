package com.spring.api.service;

import java.util.List;

import com.spring.api.model.Employee;

public interface EmployeeService {
List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
