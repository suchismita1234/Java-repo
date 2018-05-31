package com.akshaya.java8.dataApi;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDateDemo ldd=new LocalDateDemo();
		ldd.generatePaySlip();
	}
	private void generatePaySlip() {
		// Code for generating pay slip
		LocalDate paySlipDate = LocalDate.now();
		display(paySlipDate);          		
	}
	private void display(LocalDate paySlipDate) {
		System.out.println(paySlipDate);
		Period period = Period.of(1, 5, 2001);
	       System.out.println(period.getDays() + "\t" + period.getMonths());
	}
}
