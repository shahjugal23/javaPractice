package com.self.study;

import java.util.Scanner;

public class Calculator {
	// Try catch block is missing to handle the number format exceptions when user enters a character instead of a number
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String c = "Calculator Application";
		System.out.println(c);
		for (int i = 0; i < c.length(); i++) {
			System.out.print("*");
		}

		String choice = "temp";
		double d1, d2, result=0;
		String s1, s2;
		while (!(choice.equals("Exit"))) {
			System.out.println("\nEnter your choice!");
			System.out.println("+  : Addition");
			System.out.println("-  : Subtraction");
			System.out.println("*  : Multiplication");
			System.out.println("/  : Division");
			System.out.println("Exit : Quit the application");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextLine();

			switch (choice) {
			case "+":
				System.out.println("Please enter a number 1: ");
				s1 = scan.nextLine();
				System.out.println("Please enter a number 2: ");
				s2 = scan.nextLine();
				
				result = add(s1,s2);
				System.out.println("The addition is : " + result);
				break;

			case "-":
				System.out.println("Please enter a number 1: ");
				s1 = scan.nextLine();
				System.out.println("Please enter a number 2: ");
				s2 = scan.nextLine();
				d1 = Double.parseDouble(s1);
				d2 = Double.parseDouble(s2);
				result = d1 - d2;
				System.out.println("The subtraction is : " + result);
				break;

			case "*":
				System.out.println("Please enter a number 1: ");
				s1 = scan.nextLine();
				System.out.println("Please enter a number 2: ");
				s2 = scan.nextLine();
				d1 = Double.parseDouble(s1);
				d2 = Double.parseDouble(s2);
				result = d1 * d2;
				System.out.println("The multiplication is : " + result);
				break;

			case "/":
				System.out.println("Please enter a number 1: ");
				s1 = scan.nextLine();
				System.out.println("Please enter a number 2: ");
				s2 = scan.nextLine();
				d1 = Double.parseDouble(s1);
				d2 = Double.parseDouble(s2);
				result = d1 / d2;
				System.out.println("The division is : " + result);
				break;

			case "Exit":
				System.out.println("Application Ended.");
				return;

			default:
				System.out.println("Wrong value entered. Please try again!");
				break;
			}
		}
	}

	private static double add(String s1, String s2) {
	double d1=0 , d2=0 ;
	try{
		d1 = Double.parseDouble(s1);
		d2 = Double.parseDouble(s2);
	}
	catch(Exception e){
		System.out.println("Please enter only a number.");
	}
	return d1+d2;
	}

}
