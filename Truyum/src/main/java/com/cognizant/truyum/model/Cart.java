package com.cognizant.truyum.model;

public class Cart {

	private  String userId;
	private long productId;
	
	public Cart(String userId, long productId) {
		super();
		this.userId = userId;
		this.productId = productId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		return "Cart [userId=" + userId + ", productId=" + productId + "]";
	}
}
