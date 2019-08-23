package com.self.study;

import java.util.ArrayList;
import java.util.List;

// add , remove, get , indexOf

public class ArrayLists {

	public static void main(String[] args) {

		// We use String as generics. We have to use the class in the generics type.
		List<String> list = new ArrayList<>(); // List  -> Interface 
		// ArrayList is implementation of the List interface
		// ArrayList has the constructor method. Not for the List interface. If we do so for List interface we will have 
		// to implement all of its methods.
		list.add("Java");
		list.add("Python");
		list.add("Perl");
		System.out.println(list);
		
		// We use the Helper class as generics -> type of item . within the diamond
		List<Integer> intList = new ArrayList<>(); 
		intList.add(1);
		intList.add(2);
		intList.add(0);
		System.out.println(intList);
		
		intList.remove(2);
		System.out.println(intList);
		
		String lang = list.get(2);
		System.out.println("Language is :"+ lang);
		
		System.out.println("Index of Java is  :"  + list.indexOf("Java"));
		System.out.println("Index of 2 is : "+ intList.indexOf(2));
		
	}

}
