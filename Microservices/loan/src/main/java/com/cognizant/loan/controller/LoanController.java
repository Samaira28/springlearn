package com.cognizant.loan.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
public class LoanController {
	public static ArrayList<Loan> lst = new ArrayList<>();
	static
	{
		lst.add(new Loan(4989379,"home",600000,5000,16));
		lst.add(new Loan(8773480,"car",80000,6000,18));
		lst.add(new Loan(5749793,"truck",20000,700,12));
	}
	@GetMapping("/loans/{number}")
	public Loan getLoanById(@PathVariable long number)
	{
		for(Loan l:lst)
		{
			if(l.getNumber()==number)
			{
				return l;
			}
		}
		return null;
	}

}
