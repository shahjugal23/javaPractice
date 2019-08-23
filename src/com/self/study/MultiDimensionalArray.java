package com.self.study;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		String[][] str = new String[3][2];
		// the first represents the number of rows  HERE ITS 3 
		// the second represents the number of columns HERE ITS 2
		// So there will be 3 rows and 2 columns.
		
		str[0][0]="Shahrukh";
		str[0][1]="Khan";
		str[1][0]="Sanjay";
		str[1][1]="Dutta";
		str[2][0]="Vicky";
		str[2][1]="Kaushal";
		
		// Length is always the outer array 
		System.out.println("The length of the array is : "+ str.length); 
		
		for (int i = 0; i < str.length; i++) {
			StringBuilder sb = new StringBuilder(); // One object for each row. Hence its inside the loop
			sb.append("The surname of ")
			.append(str[i][0])
			.append(" is ")
			.append(str[i][1]);
			
			System.out.println(sb);
		}
		
		
	}

}
