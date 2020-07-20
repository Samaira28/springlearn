package com.cognizant.springlearn;
import java.util.Date;



import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {

	public Employee()
	{
		
	}
	@NonNull
	//@Size(min=2,max=30,message="size should be between 2 to 30")
	private String name;
	
	@NonNull
	private String dateofbirth;
	private int id;
	
	@NonNull
	private int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	
	public Employee(String name,String dateofbirth, int id, int salary, String permanent) {
		super();
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.id = id;
		this.salary = salary;
		
		
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary +", dateofbirth=" + dateofbirth + "]";
	}

}