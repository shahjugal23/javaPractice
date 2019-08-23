package com.self.study;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(3, "Three");
		map.put(5, "Five");
		map.put(12, "Twelve");
		
		System.out.println(map);
		map.put(4, "Four");
		map.put(2, "Wrong");
		System.out.println(map);
		// We can overwrite the value for a key
		map.put(2, "Two");
		System.out.println(map);
		
		System.out.println("The spelling for 1 is :"+ map.get(1));
		System.out.println("The spelling for 2 is :"+ map.get(2));
		map.remove(2);
		System.out.println("Map after removing: "+map);
		
	}

}
