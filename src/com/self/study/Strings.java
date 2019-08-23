package com.self.study;

import java.util.Scanner;

public class Strings {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Character to string and vice versa
		char[] name = { 'J', 'U', 'G', 'A', 'L' };

		String name1 = new String(name);
		System.out.println("The character array is : " + name1);

		String name2 = "complex";
		char[] name3 = name2.toCharArray();
		
		// Fore Each loop
		for (char z : name3) {
			System.out.println(z);
		}
		
		// Using StringBuilder
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1 + ", " + s2 + "!";
		System.out.println("Using 3 objects of String : " + s3);
		
		StringBuilder sb = new StringBuilder();//Creates only one object
		sb.append("Hello");
		sb.append(", ");
		sb.append("World");
		sb.append("!");
		
		System.out.println("Using only 1 object of StringBuilder : "+ sb);
		
		// Scanner method to take input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a text: ");
		String input = scanner.nextLine();
		System.out.println("The value entered is : "+ input);
		
		
		//Taking multiple input values using the String Builder
		sb.delete(0, sb.length()); // Delete starting from 0 to the end of the string
		System.out.println("Enter four different values. ");
		for (int i = 0; i < 4; i++) {
			input = scanner.nextLine();
			sb.append(input+"\n");
		}
		System.out.print("The strings entered are :\n" + sb);
	}

}
