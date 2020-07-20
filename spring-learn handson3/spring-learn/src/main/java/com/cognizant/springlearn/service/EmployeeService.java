package com.cognizant.springlearn.service;
import java.util.ArrayList;

//import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.Dao.EmployeeDao;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@Service
@Component
public class EmployeeService {
	//@Transactional 
	@Autowired
	SpringLearnApplication sp;
	public  ArrayList<Employee> list = new ArrayList<>();
	
	{
		list = sp.getEmployee();
	}
	public ArrayList<Employee> getAllEmployees()
	{
		return list;
	}
	
	
	
	}
