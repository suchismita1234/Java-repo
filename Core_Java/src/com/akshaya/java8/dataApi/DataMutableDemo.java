package com.akshaya.java8.dataApi;

import java.util.Date;

public class DataMutableDemo {

	public static void main(String[] args) {
		EmployeeDate ed=new EmployeeDate(1, "Akshaya");
		System.out.println(ed.getDtJoining());
		Date paySlipDate = new Date();
		paySlipDate.setDate(9);
	}

}
