package com.cognizant.truyum.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.cognizant.truyum.model.Cart;
@Component
public class CartDao {
	

	public ArrayList<Cart> cartList = new ArrayList<>();
	
	public CartDao()
	{
		
	}

	public CartDao(ArrayList<Cart> cartList) {
		super();
		this.cartList = cartList;
	}

	public ArrayList<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<Cart> cartList) {
		this.cartList = cartList;
	}
	
}
