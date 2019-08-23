package com.collections.practice;

import java.util.List;
//Processing class
public class OlivePress {
	public int getOliveOil(List<Olives> olives){
		int totalOil = 0;
		for(Olives o : olives){
			System.out.println(o.name);
			totalOil += o.getOil();
		}
		return totalOil;
	}
}
