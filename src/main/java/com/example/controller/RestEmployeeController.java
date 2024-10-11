package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.Employee;
import com.example.services.EmployeeService;

@RestController
@RequestMapping("/res/api/employee") /*Ortak kök url yapısı*/
public class RestEmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path= "/list")
	public List<Employee> getAllEmployeeList(){
		return employeeService.getAllEmployeeList(); 
	}

	@GetMapping(path = "/list/{id}")
	public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id){
		return employeeService.getEmployeeById(id);
	}

	@GetMapping(path = "/with-params")
	public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false) String firstName,
												@RequestParam(name = "lastName", required = false) String lastName){
		System.out.println(firstName + " " + lastName);
		return employeeService.getEmployeeWithParams(firstName, lastName);
	}

	@PostMapping(path = "/save-employee")
	public Employee saveEmployee(@RequestBody Employee newEmployee){
		return employeeService.saveEmployee(newEmployee);
	}
}
