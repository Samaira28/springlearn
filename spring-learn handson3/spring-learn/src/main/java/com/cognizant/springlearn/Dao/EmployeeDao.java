package com.cognizant.springlearn.Dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.cognizant.springlearn.Employee;

@Component
public class EmployeeDao {

	public static ArrayList<Employee> EMPLOYEE_LIST =new ArrayList<>();

	
	public EmployeeDao(ArrayList<Employee> emp)
	{
		EMPLOYEE_LIST =emp;

	}
	public EmployeeDao()
	{
		
	}

	public static ArrayList<Employee> getALlEmployees() {
		return EMPLOYEE_LIST ;
	}

	public static void setEmp(ArrayList<Employee> EMPLOYEE_LIST ) {
		EmployeeDao.EMPLOYEE_LIST  = EMPLOYEE_LIST ;
	}

	
	}