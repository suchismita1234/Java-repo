package com.akshaya.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FullTimeEmpOptional extends EmployeeDemo {
	// Declaring an Optional container which can hold Passport object
	private Optional<Passport> passport = Optional.empty();    // The container is initially empty

	public FullTimeEmpOptional(int id, String name, int sal, double noOfYears,Optional<Passport> passport ) {
		super(id, name, sal, noOfYears);
		this.setPassport(passport);
	}

	public static List<FullTimeEmpOptional> getEmpList1(){
		List<FullTimeEmpOptional> list=new ArrayList<FullTimeEmpOptional>();
		list.add(new FullTimeEmpOptional(4,"Ak",10000,0.7,Optional.of(new Passport(11))));
		list.add(new FullTimeEmpOptional(3, "Bk", 2000,2,null));
		list.add(new FullTimeEmpOptional(2, "Ck", 2000,0.4,Optional.of(new Passport(33))));
		list.add(new FullTimeEmpOptional(1, "Dk", 2000,3,Optional.of(new Passport(44))));
		list.add(new FullTimeEmpOptional(5, "Ek", 2000,0.5,Optional.of(new Passport(55))));   	
		return list;
	}


	public Optional<Passport> getPassport() {
		return passport;
	}


	public void setPassport(Optional<Passport> passport) {
		this.passport = passport;
	}

}
