package com.cognizant.springlearn.Dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.Department;



@Component
public class DepartmentDao {
	private static ArrayList<Department> department = new ArrayList<>();
	
	public DepartmentDao(ArrayList<Department> dep)
	{
		department=dep;
	}
	public DepartmentDao()
	{
		
	}
	public static ArrayList<Department> getDept() 
	{
		return department;
	}
	
	public static void setDept(ArrayList<Department> dept)
	{
		DepartmentDao.department = department;
	}
	public ArrayList<Department> getAllDepartments()
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DepartmentDao d=(DepartmentDao) context.getBean("department");
		return d.getDept();
	
		
	}
	

}
