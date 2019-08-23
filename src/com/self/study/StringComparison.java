package com.self.study;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "Hello"; // s1 object is created in memory with value Hello
		String s2 = "Hello"; // s2 object is referring s1. Since the value is
								// same and Strings are immutable, the reference
								// is allowed
		if (s1 == s2) {
			System.out.println("They Match!"); // They refer to the same memory
												// location
		} else {
			System.out.println("They dont match!");
		}

		String s3 = "hello"; // s3 is a new object and is pointing to a new
								// memory address.
		if (s3 == s1) {
			System.out.println("They Match!");
		} else {
			System.out.println("They dont match!"); // They refer to different
													// memory location
		}

		String part1 = "Hello "; // part1 is a new object
		String part2 = "World"; // part2 is a new object
		String s4 = part1 + part2; // At compilation time, the compiler does not
									// know the values. So it creates a new
									// object s4
		String s5 = "Hello World"; // The compiler cannot find a match and hence
									// it creates a new object s5
		if (s4 == s5) {
			System.out.println("They Match!");
		} else {
			System.out.println("They dont match!"); // They refer to different
													// memory location
		}

		if (s4.equals(s5)) {
			System.out.println("They Match!"); // They compare the values at the
												// reference
		} else {
			System.out.println("They dont match!");
		}
	}

}
