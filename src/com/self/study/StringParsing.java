package com.self.study;

public class StringParsing {
		public static void main(String[] args){
			// Length
			String s1 = "Jugal";
			int l1 = s1.length();
			System.out.println("The length of the string is : "+ l1);
			
			//Substring - beginIndex and EndIndex - 1 is taken
			String s2 = s1.substring(2, 4); // beginindex is included. endindex is not included
			System.out.println("The substring is :"+ s2);
			
			// Position
			String s3 = "Welcome Home! ";
			int position = s3.indexOf("Home");
			System.out.println("The position of Home is : "+ position);
			System.out.println("The substring is  : "+ s3.substring(8,12)); // ! is not included 
			
			//Trim
			String s4 ="          Jugal              ";
			System.out.println("The length of the string before trim is: "+s4.length());
			String trimmed = s4.trim();
			System.out.println("The string after trim is: "+ trimmed);
			System.out.println("The lenght of the string after trim is : "+ trimmed.length());
		}
}
