package com.self.study;

public class Characters {

	public static void main(String[] args) {
		// Char is a primitive data type and not a complex object like String
		char c1 = 'a';
		char c2 = '$';
		char c3 = 'A';

		System.out.println("Character 1 : "+ c1);
		System.out.println("Character 2 : "+ c2);
		System.out.println("Character 3 : "+ c3);
		
		char a1 ='A';
		char a2 ='b';
		
		// Using the helper class Character
		System.out.println("Character a1 = A in lower case is : " + Character.toLowerCase(a1));
		System.out.println("Character a2 = b in upper case is : " + Character.toUpperCase(a2));
		System.out.println("Character to String : "+ Character.toString(a1));
	}

}
