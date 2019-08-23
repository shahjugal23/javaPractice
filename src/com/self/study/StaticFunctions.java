package com.self.study;

public class StaticFunctions {

	int i = 10;
	
	public static void main(String[] args) {
		
		// The following call will show an error
		/*           Loop("A very long string here");			*/
		//Cannot make a static reference to the non-static method Loop(String) from the type Functions
		
		// Either make the method static and then call the method
		
		
		// Or create an object of the class and call the method.
		StaticFunctions sf = new StaticFunctions();
		sf.Loop("This is a call from an object since its Non static");
		
		
		// Similarly the data types will show an error if not declared as static
		
		// System.out.println("The value of i is : "+ i); //THIS DOES NOT WORK
		System.out.println("The value of i is : "+ sf.i);
		
		// When number of arguments are unknown.
		ManyStrings("a","b","c");
		
	}
	 void Loop(String Label){
	System.out.println(Label);
	for(int i=0; i<Label.length();i++){
		System.out.print("*");
	}
	System.out.println("");
}
	 // Arguments are indeterminate
	 static void ManyStrings(String ... x){
		 for(String s : x){
			 System.out.println("String : "+s);
		 }
		 
	 }
}
