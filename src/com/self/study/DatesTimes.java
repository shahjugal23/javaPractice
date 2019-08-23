package com.self.study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesTimes {
	public static void main(String[] args)
	{
		// New Api has 1-12 numbering for months. Old API has 0-11
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Unix timestamp is :"+ ldt);
		
		LocalDate ld = LocalDate.now();
		System.out.println("The unix Date is :"+ ld);
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		System.out.println(dtf.format(ld));
		
		// Different pattern of Dates to displaye
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yy");
		System.out.println(dtf2.format(ld));

	}
}
