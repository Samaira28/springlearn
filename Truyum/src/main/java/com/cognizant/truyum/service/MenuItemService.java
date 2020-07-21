package com.cognizant.truyum.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

@Service
@Component
public class MenuItemService{

	@Autowired
	private MenuItemDaoCollectionImpl service;
	public ArrayList<MenuItem> getAllMenu()
	{
		return service.getMenuItemListCustomer();
	}
	public MenuItem getItemById(int id) {
		// TODO Auto-generated method stub
		for(MenuItem mi:service.getMenuItemListCustomer())
		{
			if(mi.getId()==id)
			{
				return mi;
			}
		}
		return null;
	}
	public void updateMenu(MenuItem menu) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<service.getMenuItemListCustomer().size();i++)
		{
			
			MenuItem mt=service.getMenuItemListCustomer().get(i);
			if(mt.getId()==menu.getId())
			{
				service.getMenuItemListCustomer().set(i,menu);
				count=1;
				break;
			}
		}
		if(count==0)
			service.getMenuItemListCustomer().add(menu);
		
		
		
	}
}
