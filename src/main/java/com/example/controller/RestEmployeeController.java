package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.services.EmployeeService;

@RestController
@RequestMapping("/res/api") /*Ortak kök url yapısı*/
public class RestEmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path= "/employee-list")
	public List<Employee> getAllEmployeeList(){
		
		return employeeService.getAllEmployeeList(); 
	}
}
