package com.self.study;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Argument passed is:" + args[0]); // Passing arguments in the run configurations.
		
		
		String a = "";
		System.out.println("String passed is :"+a);
		boolean b = (a == null);
		System.out.println("Is string equal to null :" + b); // String is not null. Memory is alloted for ""
		
		b = a.isEmpty();
		System.out.println("Is the String empty :"+ b); // String is empty since the length is 0.
	}
}
