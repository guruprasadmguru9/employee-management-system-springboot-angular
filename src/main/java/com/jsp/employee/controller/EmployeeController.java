package com.jsp.employee.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.employee.entity.Employee;
import com.jsp.employee.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RequestMapping
@AllArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;
	
	@PostMapping
	public String saveEmployee(@RequestBody Employee employee) {
		return "done";
	}
	
	public String fetchbyId(@PathVariable int id) {
		return "";
	}
	
	public String fetchAll() {
		return "";
	}
	
	public String updateEmployee(@RequestBody Employee employee , @PathVariable int id ) {
		return null;
		
	}
	
	public String deleteEmployee(@PathVariable int id) {
		return null;
		
	}
	
}
