package com.cognizant.springlearn;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
	public class CountryList {
		private static ArrayList<Country> countryList=new ArrayList<>();

		public CountryList()
		{
			
		}

		public ArrayList<Country> getCountryList() {
			return countryList;
		}

		public void setCountryList(ArrayList<Country> countryList) {
			this.countryList = countryList;
		}

		public CountryList(ArrayList<Country> countryList) {
			super();
			this.countryList = countryList;
		}
		
		

	}
