package com.cognizant.truyum.service;


import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.CartImp;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;
@Component
@Service
public class CartService {

	@Autowired
	private MenuItemService MenuItemService;
	
	@Autowired
	private CartImp cartI;
	
	public ArrayList<Cart>getAllCart()
	{
		 return cartI.getAllCartItems();
	}
	public void addCartItem(Cart cart) {
		
		cartI.addCart(cart);
		
	}
	
	public MenuItem getAllItems(long id, String userId) {
		// TODO Auto-generated method stub
		
		ArrayList<MenuItem> mt=MenuItemService.getAllMenu();
		for(MenuItem mi:mt)
		{
			if(mi.getId()==id)
			{
				return mi;
			}
		}
		
		return null;
		
	}
	
	public void delete(long menuItemId) {
		ArrayList<Cart> crt = cartI.getAllCartItems();
		Iterator<Cart> it = cartI.getAllCartItems().iterator();
		 while(it.hasNext())
		 {
			 if(it.next().getProductId() == menuItemId)
			 {
				 it.remove();
			 }
		 }
}
}