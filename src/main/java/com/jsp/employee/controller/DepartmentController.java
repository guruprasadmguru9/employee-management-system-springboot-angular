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

import com.jsp.employee.entity.Department;
import com.jsp.employee.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/department")
@AllArgsConstructor
public class DepartmentController {

	private final DepartmentService departmentService;
	
	@PostMapping
	public Department saveDepartment(@RequestBody Department department ) {
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/id/{id}")
	public Department fetchById(@PathVariable int id ) {
		return departmentService.fetchById(id);
		
	}
	
	@GetMapping
	public List<Department> fetchAll() {
		return departmentService.fetchAll();
		
	}
	
	@PutMapping("/id/{id}")
	public Department updateDepartment(@RequestBody Department department , @PathVariable int id) {
		return departmentService.update(id, department);
		
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteDepartment(@PathVariable int id) {
		return departmentService.delete(id);
		
	}
}
