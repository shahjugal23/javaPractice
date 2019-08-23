package com.self.study;

public class Conditions {

	public static void main(String[] args) {
		for(int i = 0; i<= 10 ; i++){
			if( i%2 == 0)
				continue; // if condition is true then it will go to the next iteration and will not execute next statment
			
			System.out.println("Odd Number : "+ i);
		}
		
		
		for(int j =0 ; j <= 5 ; j++){
			if(j==4)
				break; // if condition is true it will come out of the loop
			
			System.out.println("Numbers: "+ j);
		}
		System.out.println("Loop ended here.");
	}

}
