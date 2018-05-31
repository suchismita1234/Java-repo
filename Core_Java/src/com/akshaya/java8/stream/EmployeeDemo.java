package com.akshaya.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
		private int id;
		private String name;
		private int sal;
		private double noOfYears;
		
		public EmployeeDemo(int id,String name,int sal,double noOfYears) {
			this.setId(id);
			this.setName(name);
			this.sal=sal;
			this.noOfYears=noOfYears;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		public static List<EmployeeDemo> getEmpList(){
			List<EmployeeDemo> list=new ArrayList<EmployeeDemo>();
			list.add(new EmployeeDemo(4,"Ak",10000,0.7));
			list.add(new EmployeeDemo(3, "Bk", 2000,2));
			list.add(new EmployeeDemo(2, "Ck", 2000,0.4));
			list.add(new EmployeeDemo(1, "Dk", 2000,3));
			list.add(new EmployeeDemo(5, "Ek", 2000,0.5));
			return list;
			
		}
		public double getNoOfYears() {
			return noOfYears;
		}
		public void setNoOfYears(double noOfYears) {
			this.noOfYears = noOfYears;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
}
