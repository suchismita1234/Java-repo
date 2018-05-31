package com.akshaya.java8.dataApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDataUtility {
	public static void main(String args[]) throws ParseException {
		EmployeeDataUtility edu=new EmployeeDataUtility();
		edu.generatePaySlip();
		long lops=edu.calculateLOPs("05/02/2018", "12/02/2018");
		System.out.println(lops);
	}

	private void generatePaySlip() {
		Date paySlipDate = new Date();
        System.out.println(paySlipDate);
        //Requirement:Thu Nov 09 11:16:06 IST 2016
        paySlipDate.setDate(9);             // Notice these methods are obsolete
        paySlipDate.setMonth(11);
        paySlipDate.setYear(2016);
        System.out.println(paySlipDate);
		
	}
	public  long calculateLOPs(String startDateLOP, String endDateLOP) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date start = format.parse(startDateLOP);
        Date end = format.parse(endDateLOP);
        long diff = end.getTime() - start.getTime();    // Difference in milliseconds
        long lops = diff / (24 * 60 * 60 * 1000);       // Converting milliseconds to days
        return lops + 1;
        
    }

}
