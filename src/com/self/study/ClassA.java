package com.self.study;

public class ClassA {

	public static void main(String[] args) {
		// private -> The class can be accessed from itself.
		// protected -> The class can be accessed from package level.
		// public -> The class can be accessed from different packages.
		
		// When the static is present in the method Check() in ClassB we can directly call the method.
		ClassB.Check(); // without static it wont work.
		
		// When the static is removed from the method Check() in ClassB we have to create an object.
		ClassB obj = new ClassB();
		obj.Check();
		System.out.println("The variable from ClassB is :"+obj.c);
	}

}
