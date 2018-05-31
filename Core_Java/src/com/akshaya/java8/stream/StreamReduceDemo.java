package com.akshaya.java8.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamReduceDemo {

	public static void main(String[] args) {
		List <EmployeeDemo> lstEmp = EmployeeDemo.getEmpList();

		List<EmployeeDemo> lstNewEmp = lstEmp.stream().filter(emp -> emp.getNoOfYears() < 1)
				.map(e -> { e.setSal(e.getSal() + 5000); return e; })    // Incrementing salary
				.collect(Collectors.toList());

		System.out.println("Employees less than a year old with increment:");
		lstNewEmp.forEach(e -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal())); 

		Optional<Integer> max = lstNewEmp.stream().map(e->e.getSal())
				.reduce(Integer::max);    // Finding the maximum salalry
		List<EmployeeDemo> lstMaxEmp =  lstNewEmp.stream()
				.filter(e -> e.getSal() == max.get())    // Finding employees with the maximum salary
				.collect(Collectors.toList());

		System.out.println("\nEmployees having maximum salary after increment:");
		lstMaxEmp.forEach(e -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal())); 
	}
}
