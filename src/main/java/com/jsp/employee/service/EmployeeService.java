package com.jsp.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.employee.entity.Department;
import com.jsp.employee.entity.Employee;
import com.jsp.employee.exception.NotFoundException;
import com.jsp.employee.repository.DepartmentRepository;
import com.jsp.employee.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
	
    
    //Insert
	public Employee saveEmployee(Employee employee) {
		
		Department department = employee.getDepartment();
		Optional<Department> optional = departmentRepository.findByName(department.getName());
		
		if (optional.isPresent()) {
			
			Department existingDept = optional.get();
			employee.setDepartment(existingDept);
		} else {

			Department newDept = departmentRepository.save(department);
			employee.setDepartment(newDept);
		}
		return employeeRepository.save(employee);
	}
	
	// Fetch By Id
	public Employee fetchbyId(int id) {
		
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isPresent()) {
			
			return optional.get();
			
		} else {
            throw new NotFoundException("Employee with id: " + id + " does not exist");
		}
		
	}
	
	//Fetch ALL
	public List<Employee> fetchAllEmployee(){
	    return employeeRepository.findAll();	
	}
	
	//Update
	public Employee updateEmployee(int id , Employee employee) {
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if (optional.isPresent()) {
			Employee existingEmployee = optional.get();

	        existingEmployee.setName(employee.getName());
	        existingEmployee.setPhone(employee.getPhone());
	        existingEmployee.setEmail(employee.getEmail());
	        
			  return employeeRepository.save(existingEmployee);
		} else {
           throw new NotFoundException("Employee with id: " + id + " does not exist");
		}
	}
	
	//Delete 
	public String deleteEmployee(int id) {
		
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if (optional.isPresent()) {
			
			Employee emp = optional.get();
			employeeRepository.delete(emp);
		  return "Employee with Id:" + id + "is Deleted";
		} else {
			throw new NotFoundException("Employee with id: " + id + " does not exist");
		}
	}
}
