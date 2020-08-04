package com.cognizant.moviecruiser.model;

import java.util.List;

public class Favorites{

	private int id;
	private int us_id;
	private int mvs;

	public Favorites(int us_id, int mvs){
		super();
		this.us_id = us_id;
		this.mvs = mvs;
	}

	public Favorites(int id, int us_id, int mvs){
		super();
		this.id = id;
		this.us_id = us_id;
		this.mvs = mvs;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getUs_id(){
		return us_id;
	}

	public void setUs_id(int us_id){
		this.us_id = us_id;
	}

	public int getMvs(){
		return mvs;
	}

	@Override
	public String toString(){
		return "Favorites [id=" + id + ", us_id=" + us_id + ", mvs=" + mvs + "]";
	}

	public void setMvs(int mvs){
		this.mvs = mvs;
	}
}
