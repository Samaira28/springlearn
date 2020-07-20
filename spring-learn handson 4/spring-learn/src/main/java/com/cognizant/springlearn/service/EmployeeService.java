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
	
	public void addEmployees(Employee EMPLOYEE_LIST)
	{
		list.add(EMPLOYEE_LIST);
	}
	
	public void updateEmployees(Employee EMPLOYEE_LIST) {
		
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getId()==EMPLOYEE_LIST.getId())
			{
				count=1;
				list.set(i,EMPLOYEE_LIST);
				break;
			}
		}
		if(count==0)
		{
			throw new EmployeeNotFoundException("Employee not found");
		}
		
	}
	
	public void delete(int id) {
	
		Iterator<Employee> it = list.iterator();
		int count=0;
		while(it.hasNext())
		{
			
			Employee em=it.next();
			if(em.getId()==id)
			{
				it.remove();
				count=1;
				break;
			}
		}
		
		
		if(count == 0)
		{
			throw new EmployeeNotFoundException("Employee not found");
		}
	}
	
	
	
	}
