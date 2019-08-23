package com.self.study;

public class BigDecimal {

	public static void main(String[] args) {

		double d = .012;
		double sum = d + d + d;
		
		// Gives a wrong result
		System.out.println("The sum of the double primitive is :" + sum);
		
		String a = Double.toString(d);
		
		java.math.BigDecimal b = new java.math.BigDecimal(a);
		
		java.math.BigDecimal sum1 = b.add(b).add(b);
		
		// b.add(b) returns a Bigdecimal object. therefore we can further call the add method on this object.
		
		System.out.println("The sum of the BigDecimal is : "+ sum1);
		
	}

}
