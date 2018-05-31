package com.akshaya.java8.optional;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStarter {

	public static void main(String[] args) {
		// Code to retrieve full-time employees and to store them in a list called employeesList
		List<FullTimeEmployee> listEmp=FullTimeEmployee.getEmpList1();
		List<Integer> passportNumbers = new ArrayList<>();    // List to collect the passport numbers
		for(FullTimeEmployee employee : listEmp) {
			if(employee.getPassport()!=null)
			passportNumbers.add(employee.getPassport().getPassportNumber());
		}
		for(int i=0;i<passportNumbers.size();i++) {
			System.out.println(passportNumbers.get(i));
		}
	}
}
