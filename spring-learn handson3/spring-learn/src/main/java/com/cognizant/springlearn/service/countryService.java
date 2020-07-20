package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;


import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.SpringLearnApplication;

@Service
public class countryService {
	
	public static Country getCountry(String code)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> list = (ArrayList<Country>)context.getBean("countryList");	
		for(Country i: list )
		{
			if(i.getCode().equalsIgnoreCase(code))
			{
				return i;
			}	
		}
		return null;
		
	}
	//public ArrayList<Country> get
	
}

