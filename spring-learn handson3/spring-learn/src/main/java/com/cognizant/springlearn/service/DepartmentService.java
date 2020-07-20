package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.Dao.DepartmentDao;



@Service
@Component
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	public ArrayList<Department> getAllDepartments()
	{
		return departmentDao.getAllDepartments();
		
	}
}