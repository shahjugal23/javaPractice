package com.self.study;

public class Operators {

	public static void main(String[] args) {

		// Prefix : its incremented first and then evaluated or assigned.
		int i =10;
		System.out.println("Before increment : "+ i);
		System.out.println("Prefix ++i: "+ ++i);
		System.out.println("After increment : "+ i);
		
		// Postfix : its evaluated first and then incremented.
		int j =10 ;
		System.out.println("Before increment : "+ j );
		System.out.println("Postfix j++: "+ j++);
		System.out.println("After increment : "+ j );
		
		// String Operators -> Use the string class methods. Cannot use = or ==
		String s1 = "Hello";
		String s2 = "hello";
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Strings match! (Case not important)");
		}
		if(s1.equals(s2)){
			System.out.println("Strings match! (Case important");
		}
		else{
			System.out.println("Strings do not match ! (Case is important)");
		}
	}

}
