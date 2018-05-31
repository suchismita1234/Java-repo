package com.akshaya.java8.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemoMain {
	public static void main(String args[]) {
		List<EmployeeDemo> listemp=EmployeeDemo.getEmpList();
		Stream<EmployeeDemo> empStream = listemp.stream();
		//System.out.println(empStream);
		empStream.forEach((e)-> System.out.println(e.getId()));		
	}
}
