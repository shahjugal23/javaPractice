package com.self.study;

import java.text.NumberFormat;

public class StringConversions {

	public static void main(String[] args) {

		byte a = 100; // 8 bits
		short b = 200 ; //16 bits
		int c = 300; //32 bits
		long d = 400l ; //64 bits
		float x =  500.001F; //F or f is required to explicitly define it 
		double l = 600.002d; //D or d is required.
		
		// Convert the above to Strings
		String S;
		// Use the Helper class and call the toString() method with the arguments.
		S = Byte.toString(a);
		System.out.println("String value of Byte is : "+S);
		
		S = Short.toString(b);
		System.out.println("String value of Short is : "+S);
		
		S = Integer.toString(c);
		System.out.println("String value of Int is : "+S);
		
		S = Long.toString(d);
		System.out.println("String value of Long is : "+S);
		
		S = Float.toString(x);
		System.out.println("String value of Float is : "+S);
		
		S = Double.toString(l);
		System.out.println("String value of Double is : "+S);
		
		long l1 = 10_000_000;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		String formatted = formatter.format(l1);
		System.out.println("The long number in string after using Number formatter: "+formatted);
	}

}
