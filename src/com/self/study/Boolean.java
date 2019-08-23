package com.self.study;

public class Boolean {

	static boolean bDef; //This is static(can be called directly without creating object) and global. No need to initialize.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("The value of B1 is : "+ b1);
		System.out.println("The value of B2 is : "+ b2);
		System.out.println("The value of BDef is : "+ bDef); // Default value of boolean is FALSE
		
		boolean b3 = !b1; //Negate the value
		System.out.println("The value of B3 is : "+ b3);
		
		
		int i =10;
		boolean b4 = (i != 10); //Condition 
		System.out.println("The value of B4 is : "+ b4);
		
		int x = 10 ;
		int y = 10 ;
		boolean test = (x == y) ? true : false;
		System.out.println("Ternary if condition : "+ test);
	}
}
