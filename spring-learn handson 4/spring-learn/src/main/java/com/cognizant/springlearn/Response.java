package com.cognizant.springlearn;

public class Response {
	private String id;
	private boolean status;
	
	
	public Response(String id, boolean status) {
		super();
		this.id = id;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Respone [id=" + id + ", status=" + status + "]";
	}
}



