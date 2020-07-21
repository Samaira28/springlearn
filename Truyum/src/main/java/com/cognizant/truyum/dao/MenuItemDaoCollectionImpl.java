package com.cognizant.truyum.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.truyum.model.MenuItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MenuItemDaoCollectionImpl   {
	public static ArrayList<MenuItem> menu=new ArrayList<>();	

	{
		ApplicationContext context = 

				new ClassPathXmlApplicationContext("truyum.xml");
		MenuItemDao mnD = (MenuItemDao) context.getBean("menuListItems");
		menu=mnD.menuu;
		
	}
	
	public ArrayList<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		return menu;
		
	}
	

}
