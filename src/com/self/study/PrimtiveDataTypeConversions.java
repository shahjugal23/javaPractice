package com.self.study;

public class PrimtiveDataTypeConversions {
	// Type conversions for the data types.
	public static void main(String[] args) {
		
		System.out.println("Converting Integer to others");
		int newInt = 100;
		
		// 1. Create an object of the data type which needs to be converted using helper class.
		Integer obj1 = new Integer(newInt); 
		
		// 2. Directly call the values method using this object
		double d = obj1.doubleValue();
		float f = obj1.floatValue();
		String s= obj1.toString();
		
		System.out.println("Integer value is: " + obj1.intValue());
		System.out.println("Float value is: " + f );
		System.out.println("Double value is: " + d);
		System.out.println("String value is: " + s);
		
		System.out.println("Converting Double to others");
		double newDouble = 2.1122d;
		
		// 1. Create an object of the data type which needs to be converted using the helper class.
		Double obj2 = new Double(newDouble);
		
		// 2. Directly call the value method using the object
		int i = obj2.intValue();
		float f1 = obj2.floatValue();
		String s1 = obj2.toString();
		
		System.out.println("Double value is: " + obj2.doubleValue());
		System.out.println("Float value is: " + f1 );
		System.out.println("Integer value is: " + i);
		System.out.println("String value is: " + s1);
		
	}
}
