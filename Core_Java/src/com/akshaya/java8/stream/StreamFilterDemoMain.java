package com.akshaya.java8.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamFilterDemoMain {

	public static void main(String[] args) {
		List<EmployeeDemo> listemp=EmployeeDemo.getEmpList();
		Stream<EmployeeDemo> streamEmp=listemp.stream();
		Stream<EmployeeDemo> listNewEmp=streamEmp.filter(emp->emp.getNoOfYears()<1);
		//listNewEmp.forEachOrdered(emp->System.out.println(emp.getId()));
		//listNewEmp.forEach(emp->System.out.println(emp.getId()));
		//Sorting the Stream
		Stream<EmployeeDemo> sortedEmpStream =listNewEmp.sorted((emp1,emp2)->emp1.getId()-emp2.getId());
		sortedEmpStream.forEach(emp->System.out.println(emp.getId()));
	}
}
