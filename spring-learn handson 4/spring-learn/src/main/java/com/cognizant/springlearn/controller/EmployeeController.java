package com.cognizant.springlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import javax.validation.Valid;
import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.service.EmployeeService;


import java.util.ArrayList;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/employee")
	public ArrayList<Employee>  getAllEmployees()
	{
		return employeeservice.getAllEmployees();	
		
	}
	
	
}
