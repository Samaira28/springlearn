package com.cognizant.truyum.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.CartService;


@RestController
class CartController {

	@Autowired
	private CartService cartService;
	
	@GetMapping("/getAllCart")
	public ArrayList<Cart> getAllCartItems()
	{
		return cartService.getAllCart();
																		
	}

	@PostMapping("/addCart")
	public void addCart(@RequestBody Cart cart)
	{
		cartService.addCartItem(cart);
	}

	@GetMapping("/getAllCartItems/{id}/{userId}")
	public MenuItem getAllCartIte(@PathVariable long id, String userId)
	{
		return cartService.getAllItems(id,userId);
	}

	@DeleteMapping("/deleteCart/{menuItemId}")
	public void delete(@PathVariable long menuItemId)
	{
		cartService.delete(menuItemId);
	}
	
}
