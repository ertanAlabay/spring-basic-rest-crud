package com.example.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("1", "Ertan", "Alabay"));
		employeeList.add(new Employee("2", "Harun", "Duman"));
		employeeList.add(new Employee("3", "H. Hüseyin", "Turhan"));
		employeeList.add(new Employee("4", "S. Kutlat", "Gürdal"));
		employeeList.add(new Employee("5", "Abdullah", "Bülbül"));
		return employeeList;
	}
}
