package com.cognizant.springlearn;

public class DateFormat {
	@Override
	public String toString() {
		return "DateFormat [date=" + date + "]";
	}

	String date;

	public DateFormat(String date) {
		super();
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
