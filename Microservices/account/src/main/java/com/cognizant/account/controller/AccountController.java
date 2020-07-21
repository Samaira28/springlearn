package com.cognizant.account.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
public class AccountController {
	static ArrayList<Account> list  = new ArrayList<>();
	static
	{
		
		list.add(new Account(4989379,"savings",74886));
		list.add(new Account(8773480,"savings",470345));
		list.add(new Account(5749793,"savings",89746));
	}
	@GetMapping("/accounts/{number}")
	public Account getActByNum(@PathVariable long number)
	{
	       for(Account acc:list)
	       {
	    	   if(acc.getNumber()==number)
	    	   {
	    		   return acc;
	    	   }
	       }
	        
	    	return   null;
	}
	

}
