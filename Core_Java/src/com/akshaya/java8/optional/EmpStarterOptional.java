package com.akshaya.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmpStarterOptional {

	public static void main(String[] args) {
		// Code to retrieve full-time employees and to store them in a list called employeesList
		List<FullTimeEmpOptional> listEmp=FullTimeEmpOptional.getEmpList1();
		List<Integer> passportNumbers = new ArrayList<>();    // List to collect the passport numbers
		for(FullTimeEmpOptional employee : listEmp) {
			Optional<EmployeeDemo> optEmp = Optional.of(employee);
            //passportNumbers.add(optEmp.flatMap(FullTimeEmpOptional::getPassport).map(Passport::getPassportNumber).orElse(0));
		}
		for(int i=0;i<passportNumbers.size();i++) {
			System.out.println(passportNumbers.get(i));
		}
	}
}
