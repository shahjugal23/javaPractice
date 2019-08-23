package com.self.study;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		int intValue1 = 10;
		int intValue2 = intValue1; // This is a copy and not a reference.
		
		System.out.println("The 2nd int value is : "+ intValue2);
		
		// Widening. Going from lower memory to higher memory
		double doubleValue = intValue1; // No syntax errors.
		System.out.println("The Double value is :" + doubleValue);
		
		// Narrowing. Going from higher memory to lower memory.
		// Casting is required as suggested.
		short shortValue = (short) intValue1;
		System.out.println("The short value after cast is :"+ shortValue);
		
		// Data loss due to Type Casting.
		double d = 2.3d;
		int i = (int) d;
		System.out.println("The integer value of 2.3d is :"+ i);
		
		int j = 1025;
		byte b = (byte)j;
		System.out.println("The Byte value of 1025 is: "+b);
	}

}
