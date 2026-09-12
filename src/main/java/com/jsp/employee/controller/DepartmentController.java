package com.jsp.employee.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.employee.entity.Department;
import com.jsp.employee.service.DepartmentService;

import lombok.AllArgsConstructor;

@RequestMapping
@AllArgsConstructor
public class DepartmentController {

	private final DepartmentService departmentService;
	
	
	public String saveDepartment(@PathVariable int id) {
		return null;
		
	}
	
	public String fetchbyId(@PathVariable int id) {
		return null;
		
	}
	
	public String fetchAll() {
		return null;
		
	}
	
	public String updateDepartment(@RequestBody Department department , @PathVariable int id) {
		return null;
		
	}
	
	public String deleteDepartment(@PathVariable int id) {
		return null;
		
	}
}
