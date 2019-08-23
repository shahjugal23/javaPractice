package com.self.study;

import java.util.Scanner;

public class Swtich {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Switch case using Primitives.");

		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int i = Integer.parseInt(input);

		switch (i) {
		case 1:
			System.out.println("The number is One");
			break;

		case 2:
			System.out.println("The number is Two");
			break;

		case 3:
			System.out.println("The number is Three");
			break;

		case 4:
			System.out.println("Exiting...");
			return;

		default:
			System.out.println("Not available!");
			break;
		}

		System.out.println("Switch case using String.");

		System.out.println("Enter a String : ");
		input = scan.nextLine();

		switch (input) {
		case "One":
			System.out.println("The string entered is 1 ");
			break;
		case "Two":
			System.out.println("The string entered is 2 ");
			break;

		case "Three":
			System.out.println("The string entered is 3 ");
			break;

		default:
			System.out.println("Unknown string : " + input);
			break;
		}

		System.out.println("Enter a number");
		input = scan.nextLine();
		int j = Integer.parseInt(input);

		switch (j) {
		case 1:
			System.out.println("Entered one!");
			break;
		case 2: // Case 5 will be executed
		case 3: // Case 5 will be executed
		case 4: // Case 5 will be executed
		case 5: // Case 5 will be executed
			System.out.println("Entered five!");
		}

	}

}
