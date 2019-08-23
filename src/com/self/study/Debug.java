package com.self.study;

public class Debug {

	public static void main(String[] args) {

		String welcome = "Welcome!";
		char[] chars = welcome.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}

		try {
			char lastchar = chars[chars.length - 1];
			System.out.println("the last character is : " + lastchar);

			String sub = welcome.substring(9);
			System.out.println("The substring is : " + sub);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array problem!"); // This is caught because of
													// the array indexing
													// problem
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String problem!"); // This is caught because of
													// the substring problem
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("In the catch block!");
		}
		System.out.println("Code flow is not stopped due to the exception!");
		
		try{
			if(chars.length < 20)
			{
				throw (new Exception("This is a custom exception message!"));
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
