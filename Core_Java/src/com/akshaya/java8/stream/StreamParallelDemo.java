package com.akshaya.java8.stream;

import java.util.List;

public class StreamParallelDemo {
	public static void main(String[] args) {
		List<EmployeeDemo> lstEmp = EmployeeDemo.getEmpList();
        lstEmp.parallelStream().filter(emp -> emp.getNoOfYears() < 1)
            .sorted((e1, e2) -> e1.getId() - e2.getId())
            .forEach((e) -> System.out.println(e.getId() + ":" + e.getName()));
	}
}
