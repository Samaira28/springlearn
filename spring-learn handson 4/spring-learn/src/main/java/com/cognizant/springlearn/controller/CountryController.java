package com.cognizant.springlearn.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.Response;
import com.cognizant.springlearn.service.countryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
//@RequestMapping(value = "/country")

public class CountryController {
	
	@Autowired
	private countryService countryService;
	
	@RequestMapping(value ="/country")
	 public Country getCountryIndia() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country obj = (Country) context.getBean("in");	
		return obj;
	}
	@GetMapping("/countries")
	public ArrayList<Country> getAllCountries()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> list = (ArrayList<Country>)context.getBean("countryList");	
		return list;
		
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) {
		Country country =  countryService.getCountry(code);
		if(country == null)
		{
			throw new CountryNotFoundException();
		}
		
		return country;
		
		
	}
	
	@PostMapping("/addCountry")
	public Response addcountry(@RequestBody @Validated Country count)
	{
		countryService.setCountry(count);
		return new Response(count.getCode(),true);

	}
	
}
