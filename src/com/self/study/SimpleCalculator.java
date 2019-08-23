package com.self.study;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number 1: ");
		String s1 = scan.nextLine();
		System.out.println("Please enter a number 2: ");
		String s2 = scan.nextLine();
		
		System.out.println("Entered numbers are : "+ s1 + " and "+ s2);
		
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
	
		double sum = d1 + d2;
		double diff = d1 - d2 ;
		double prod = d1 * d2 ;
		double div = d1 / d2;
		
		System.out.println("The sum is : "+ sum);
		System.out.println("The difference is : "+ diff);
		System.out.println("The product is : "+ prod);
		System.out.println("The division is : "+ div);
		
	}
}
