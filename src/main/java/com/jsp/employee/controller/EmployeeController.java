package com.jsp.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.employee.entity.Employee;
import com.jsp.employee.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;
	
	// Insert
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
		
	}
	
	// Fetch By Id
	@GetMapping("id/{id}")
	public Employee fetchbyId(@PathVariable int id) {
		return employeeService.fetchbyId(id);
		
	}
	
	// Fetch All
	@GetMapping
	public List<Employee> fetchAll() {
		return employeeService.fetchAllEmployee();
	}
	
	// Update
	@PutMapping("id/{id}")
	public Employee updateEmployee(@RequestBody Employee employee , @PathVariable int id ) {
		return employeeService.updateEmployee(id, employee);
		
	}
	
	// Delete
	@DeleteMapping("id/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
	
}
