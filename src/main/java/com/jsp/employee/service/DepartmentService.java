package com.jsp.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jsp.employee.entity.Department;
import com.jsp.employee.exception.NotFoundException;
import com.jsp.employee.repository.DepartmentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentService {

	public final DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		
		Optional<Department> optional = departmentRepository.findByName(department.getName());
		
		if (optional.isPresent()) {
			return optional.get();
			
		} else {
           return  departmentRepository.save(department);
		}
	}
	
	public Department fetchById(int id) {
		Optional<Department> optional = departmentRepository.findById(id);
		
		if (optional.isPresent()) {
			return optional.get();
		} else {
            throw new NotFoundException("Department with Id:" + id + " does not exist");
		}
	}
	
	public  List<Department> fetchAll(){
		return departmentRepository.findAll();
	}
	
	public Department update(int id , Department department) {
		
		Optional<Department> optional = departmentRepository.findById(id);
		
		if (optional.isPresent()) {
			Department existingDept = optional.get();
			
			existingDept.setName(department.getName());
	
			return departmentRepository.save(existingDept);
		} else {
			throw new NotFoundException("Department with Id:" + id + " does not exist");
		}
	}
	
	public String delete(int id) {
		
		Optional<Department> optional = departmentRepository.findById(id);
		
		if (optional.isPresent()) {
			Department existDept = optional.get();
			
			if (!existDept.getEmployees().isEmpty()) {
				throw new NotFoundException("Cannot delete department because employees are assigned to it");
			}
			departmentRepository.delete(existDept);
			return "Department with Id:" + id + " is Deleted";
		} else {
			throw new NotFoundException("Department with Id:" + id + " does not exist");
		}
	}
}
