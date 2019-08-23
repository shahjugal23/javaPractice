package com.collections.practice;

import java.util.ArrayList;
import java.util.List;

public class OliveMain {

	public static void main(String[] args) {

		List<Olives> olives = new ArrayList<>();
		Olives olive1 = new Olives();
		olives.add(olive1);
		Olives olive2 = new Olives();
		olive2.setOil(1);
		olives.add(olive2);
		Olives olive3 = new Olives();
		olive3.setOil(6);
		olives.add(olive3);
		
		for(Olives o : olives){
			System.out.println("The color is : "+ o.color);
			System.out.println("The name is : "+ o.name);
			System.out.println("The oil content is : "+ o.oil);
		}

		OlivePress press = new OlivePress();
		int totalOil = press.getOliveOil(olives);
		System.out.println("Total Oil generated is: "+ totalOil);
	}

}
