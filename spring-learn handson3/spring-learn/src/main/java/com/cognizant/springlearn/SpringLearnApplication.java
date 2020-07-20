package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.Dao.EmployeeDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.cognizant"} )
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main (String[] args) throws ParseException{
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
		displayCountry();
		//ArrayList<Country> cnt=displayCountries();
		ArrayList<Employee> emp = getEmployee();
	}
	
	public static void displayDate() throws ParseException {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		//System.out.println(format.parse("31/12/2018"));
	    LOGGER.debug(format.parse("31/12/2018").toString());
		LOGGER.info("END");
	}
	public static void displayCountry()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		//Country anotherCountry = context.getBean("country", Country.class);

	}
	public static void displayCountries()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> Arraylist = (ArrayList<Country>)context.getBean("countryList");
		LOGGER.debug(Arraylist.toString());
	}

	public static ArrayList<Employee> getEmployee()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeDao emp = (EmployeeDao) context.getBean("employlist");
		return emp.EMPLOYEE_LIST;
	}


}


