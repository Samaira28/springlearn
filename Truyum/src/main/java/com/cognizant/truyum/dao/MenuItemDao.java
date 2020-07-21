package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDao {

	
	
	public static ArrayList<MenuItem> menuu=new ArrayList<>();
	
	public MenuItemDao()
	{
		
	}

	public static ArrayList<MenuItem> getMenu1() {
		return menuu;
	}

	public static void setMenu1(ArrayList<MenuItem> menu1) {
		MenuItemDao.menuu = menuu;
	}	
}
