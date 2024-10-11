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

		employeeList.add(new Employee("1", "Ertan", "Alabay","24","Erkek"));
		employeeList.add(new Employee("2", "Harun", "Duman","13","Hanım"));
		employeeList.add(new Employee("3", "H. Hüseyin", "Turhan","26","Erkek"));
		employeeList.add(new Employee("4", "S. Kutlat", "Gürdal","23","Erkek"));
		employeeList.add(new Employee("5", "Abdullah", "Bülbül","27","Erkek"));
		return employeeList;
	}
}
