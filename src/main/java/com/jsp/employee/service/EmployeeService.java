package com.jsp.employee.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.employee.entity.Employee;
import com.jsp.employee.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeService {

	public final EmployeeRepository employeeRepository;
	
	public String saveEmployee(@RequestBody Employee employee) {
		
		
		
		return null ;
	}
}
