package com.akshaya.java8.dataApi;

import java.util.Date;

public class EmployeeDate {
	private int id;
	private String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDtJoining() {
		return dtJoining;
	}

	private Date dtJoining;
	
	public EmployeeDate(int id, String name) {
		this.id = id;
		this.name = name;
		dtJoining = new Date();
	}
}
