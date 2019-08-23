package com.self.study;

public class PassingArguments {

	public static void main(String[] args) {
		
		// Passing Primitive Data types
		int originalInt = 10;
		System.out.println("The original int value is : "+ originalInt);
		changeInt(originalInt); // a copy is sent. The original value remains intact.
		System.out.println("The value after method call : "+originalInt); // The value is not changed.
		
		
		// Passing Array 
		int arOriginal[] ={10,20,30};
		System.out.println("Original value of 1st element: "+arOriginal[0]);
		changeArray(arOriginal);// a copy of address is sent. So the address values can be changed.
		System.out.println("The value after method call : "+arOriginal[0]); // The value is changed.
		
		
		// Passing String
		// Strings are immutable. once saved the value cannot be changed.
		String org = "Original!";
		System.out.println("The original String is : "+org);
		changeString(org);// a copy is sent. The original value remains intact.
		System.out.println("The value after method call: "+org);// The value is not changed.
		
	}
	static void changeInt(int i){
		i++; // The copy of the value is incremented. Original is not touched.
		System.out.println("Inside the method value is: "+i);
	}
	static void changeArray(int ar[]){
		ar[0]++; // The address value is changed.
		System.out.println("Inside the method value of ar[0] is : "+ar[0]);
	}
	static void changeString(String s){
		s = "New!";// The copy of the value is changed. Original is not touched.
		System.out.println("Inside the method value of String is :"+s);
	}
}
