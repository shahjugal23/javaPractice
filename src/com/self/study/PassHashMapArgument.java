package com.self.study;

import java.util.HashMap;
import java.util.Set;

public class PassHashMapArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		displayMap(map);
		updateMap(map);
		displayMap(map);

	}
	
	public static void displayMap(HashMap<String, Integer> m){
		Set<String> s = m.keySet();
		for(String a : s){
			System.out.println("KEY : "+ a +" Value : "+ m.get(a));
		}
	}
	
	// The map is passed by value. i.e. the address location of the map is copied. 
	public static void updateMap(HashMap<String, Integer> m){
		m.clear();
		m.put("New", 1);
		m.put("New2", 2);
	}

}
