package com.akshaya.java8.optional;

import java.util.ArrayList;
import java.util.List;

public class FullTimeEmployee extends EmployeeDemo {
	private Passport passport;

	 public FullTimeEmployee(int id, String name, int sal, double noOfYears,Passport passport ) {
		super(id, name, sal, noOfYears);
		this.passport=passport;
		
	}
		
	    public Passport getPassport() {
	        return passport;
	    }
	    public void setPassport(Passport passport) {
	        this.passport = passport;
	    }
    public static List<FullTimeEmployee> getEmpList1(){
    	List<FullTimeEmployee> list=new ArrayList<FullTimeEmployee>();
    	list.add(new FullTimeEmployee(4,"Ak",10000,0.7,new Passport(11)));
		list.add(new FullTimeEmployee(3, "Bk", 2000,2,null));
		list.add(new FullTimeEmployee(2, "Ck", 2000,0.4,new Passport(33)));
		list.add(new FullTimeEmployee(1, "Dk", 2000,3,new Passport(44)));
		list.add(new FullTimeEmployee(5, "Ek", 2000,0.5,new Passport(55)));    	
    	return list;
		}
}
