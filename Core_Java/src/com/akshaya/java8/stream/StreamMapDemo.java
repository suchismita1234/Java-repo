package com.akshaya.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		List<EmployeeDemo> listEmp=EmployeeDemo.getEmpList();
		listEmp.forEach((emp)->System.out.println(emp.getId()+":"+emp.getName()+":"+emp.getSal()+":"+emp.getNoOfYears()));
		System.out.println(".........................");
		List<EmployeeDemo> listNewEmp=listEmp.stream()
				.filter((emp)->emp.getNoOfYears()<1)
				.map(emp->{emp.setSal(emp.getSal()+5000);return emp;})
				.collect(Collectors.toList());
		listNewEmp.forEach((emp)->System.out.println(emp.getId()+":"+emp.getName()+":"+emp.getSal()+":"+emp.getNoOfYears()));
	}
}
