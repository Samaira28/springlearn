package com.cognizant.truyum.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.truyum.model.Cart;
@Component
public class CartImp {
	private ArrayList<Cart> cartListI=new ArrayList<>();
	
	@Autowired
	private CartDao crtI;
	
	
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("truyum.xml");
		CartDao mnD= (CartDao) context.getBean("cartMenu");
		cartListI=mnD.cartList;
		
	}
	public ArrayList<Cart> getAllCartItems(){
		return cartListI;
	}
	public void addCart(Cart cart)
	{
		cartListI.add(cart);
	}

	
}
