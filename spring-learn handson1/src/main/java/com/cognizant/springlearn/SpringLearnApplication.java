package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main (String[] args) throws ParseException{
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
		displayCountry();
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
		ArrayList<Country> Arraylist=(ArrayList<Country>)context.getBean("countryList");
		LOGGER.debug(Arraylist.toString());
	}

}


