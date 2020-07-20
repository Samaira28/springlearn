package com.cognizant.springlearn.service.exception;

public class EmployeeNotFoundException  extends RuntimeException  {
	
		public EmployeeNotFoundException(String arg)
		{
			super(arg);
		}
	}
