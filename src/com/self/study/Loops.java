package com.self.study;

public class Loops {

	public static void main(String[] args) {
		String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		/*
		// For Loop Incremental
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
		
		System.out.println("***Reverse Order of Days array***");
		// For Loop Decremental
		for(int i = days.length -1; i>=0; i--){
			System.out.println(days[i]);
		}
		
		
		// For each loop
		for(String i : days){
			System.out.println(i);
		}*/
		
		// While loop
		int counter = 0;
		while(counter < days.length){
			System.out.println(days[counter]);
			counter ++ ;
		}
		
		
		// Do While Loop
		int j =20;
		do{
		System.out.println("This should not have executed. ");
		j++;
		}while(j<20);
	}

}
