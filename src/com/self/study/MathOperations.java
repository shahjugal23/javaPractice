package com.self.study;

public class MathOperations {

	public static void main(String[] args) {

		int a = 28;
		int b = 12;
		
		int result1 = a+b;
		System.out.println("The Addition is : "+ result1);
		
		int result2 = a-b;
		System.out.println("The Subtraction is : "+ result2);
		
		int result3 = a*b;
		System.out.println("The Multiplication is : "+ result3);
		
		int result4 = a/b;
		System.out.println("The Division is : "+ result4);
		
		double division = (double)a / b;  // The result will the widest of the 2. Here the numerator is widest
		System.out.println("The corrrect Division is: "+ division);
		
		int result5 = a%b;
		System.out.println("The Remainder is : "+ result5);
		
		double rem = a % (double)b; // here the denominator is widest.
		System.out.println("The correct Remainder is : "+rem);

		
		double dvalue = -3.1122d;
		// Rounding -> double to long OR float to int
		long longValue = Math.round(dvalue);
		System.out.println("The rounded value of -3.1122 is : "+longValue);
		
		// Absolute -> Same data type.
		double absValue = Math.abs(dvalue);
		System.out.println("The absolute value of -3.1122 is : "+absValue);
		
	}

}
