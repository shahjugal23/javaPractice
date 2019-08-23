package com.self.study;

public class ClassDerived extends ClassBase {

	int var = 20;
	
	public static void main(String[] args) {
		ClassDerived obj = new ClassDerived();
		
		obj.MethodA();
		obj.MethodB();
		obj.printVar();
		
		
		ClassBase objBase = new ClassBase(); // BaseClass object -> BaseClass
		ClassBase objDer = new ClassDerived(); // BaseClass object -> Derived
		
		objBase.Bark(); // Calls the base class Bark method.
		objDer.Bark();  // Calls the derived class Bark method. RUNTIME
		
		
		//objDer.Fail(); This method is not present in the Base class
		// Although initialized to the derived class, the base class does not have the Fail() method during compile time.
	}
	
	public void MethodB(){
		System.out.println("Derived Class method A");
	}

	public void printVar(){
		System.out.println("The var is base class is : " + super.var);
		System.out.println("The var is derived class is : "+ var);
	}
	
	public void Bark(){
		System.out.println("Class Derived is called!");
	}
	public void Fail(){
		System.out.println("This method will not be called!");
	}
}
