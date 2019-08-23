package com.self.study;

import java.util.Arrays;

public class SimpleArrays {
// Arrays sort and System.arraycopy are the built in methods that are used. 
	public static void main(String[] args) {
		
		// Primitive arrays
		System.out.println("Arrays of primitives!");
		int[] first = {10,32,6,1,66,89}; // default value is 0
		displayArray(first);
		System.out.println("After Sorting the array!");
		Arrays.sort(first); // Arrays Sort
		displayArray(first);
		
		
		System.out.println("Arrays of String!");
		String[] str = new String[3];
		str[0]="red";
		str[1]="blue";
		str[2]="orange";
		//str[3]="green";// Index out of Bounds
		
		for(String s : str){
			System.out.println(s);
		}
		System.out.println("After Sorting the array!");
		Arrays.sort(str);
		for(String s : str){
			System.out.println(s);
		}
		
		// Size of an array is predefined.
		System.out.println("Defining the size of an array");
		int[] sized = new int[10]; 
		for (int i = 0; i < sized.length; i++) {
			sized[i] = i*10;
		}
		displayArray(sized);
		
		
		System.out.println("The copied array is ");
		int[] copy = new int[5];
		System.arraycopy(sized, 5, copy, 0, 5);
		displayArray(copy);
	}

	private static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Value at "+i+" is : "+arr[i]);
		}
	}

}
