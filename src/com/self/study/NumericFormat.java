package com.self.study;

import java.text.NumberFormat;
import java.util.Locale;

public class NumericFormat {
	// This code is used to convert the numbers to String using NumberFormat
	public static void main(String args[]){
		
		Locale locale = new Locale("en", "IN");
		Locale locale1 = new Locale("de", "DE");
		
		double d = 1_234_567.922d;
		System.out.println("Double value is : "+ d);
		
		
		// nf is calling the static method getNumberInstance()
		NumberFormat nf = NumberFormat.getNumberInstance();
		System.out.println("The number after formatting is : "+ nf.format(d));
		
		// nf is initiated with DE locale format
		NumberFormat nf1 = NumberFormat.getNumberInstance(locale1);
		System.out.println("The number after DE formatting is : "+ nf1.format(d));
		
		// Curreny format will add Rs. for the object
		NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
		System.out.println("The number is currency format is : "+ cf.format(d) );
		
		// Will format it to integer and round the number
		NumberFormat if1 = NumberFormat.getIntegerInstance();
		System.out.println("The number in integer format is : "+ if1.format(d));
	}
}
