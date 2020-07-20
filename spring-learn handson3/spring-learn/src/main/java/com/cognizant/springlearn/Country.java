package com.cognizant.springlearn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	public String code;
	public String name;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public String toString()
	{
		return "Country{ Code: "+ code +"Country Name: "+ name +"}";
		
	}
	
	public String getCode() {
		LOGGER.debug("Getter");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("Setter");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("Getter");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("Setter");
		this.name = name;
	}
	public Country() {
		super();
		LOGGER.debug("Inside Country Constructor.");
	}
	
	

	
}
