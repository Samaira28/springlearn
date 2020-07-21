package com.cognizant.truyum.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

@RestController
public class MenuItemController {
	
	@Autowired																	//ser - service
	private MenuItemService service;
	
	@GetMapping("/getAllMenu")
	public ArrayList<MenuItem> getAll()
	{
		return service.getAllMenu()
;	}
	
	@GetMapping("/getItem/{id}")
	public MenuItem getMenu(@PathVariable int id)
	{
		return service.getItemById(id);
	}
	
	@PutMapping("/update")
	public void updateItem(@RequestBody MenuItem menu)
	{
		service.updateMenu(menu);
	}

}
