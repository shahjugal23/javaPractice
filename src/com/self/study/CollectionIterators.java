package com.self.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionIterators {

	public static void main(String[] args) {
		
		// Display the List items using Basic Method, Iterator and For Each loop.
		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		System.out.println("Simple display of the List !");
		System.out.println(list);
		
		System.out.println("Display List items using the Iterator method");
		Iterator<String> iterator = list.iterator(); // Iterator is the interface which is implemented
		while(iterator.hasNext()){
			String listItem = iterator.next();
			System.out.println(listItem);
		}
		
		System.out.println("Display List items using For Each loop");
		// It is similar to the display of elements in an Array.  See SimpleArray.java 
		for(String s : list){
			System.out.println(s);
		}
		
		// Display the HashMap items using Basic Method, Iterator and For Each Loop.
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		System.out.println("Simple display of the HashMap!");
		System.out.println(map);
		
		System.out.println("Display HashMap items using the Iterator method");
		Set<Integer> keys = map.keySet();
		System.out.println("the set values are : "+keys);
		
		Iterator<Integer> iterator1 = keys.iterator();
		while(iterator1.hasNext()){
			int key = iterator1.next();
			System.out.println("KEY : "+key+" VALUE " +map.get(key));
		}
		
		System.out.println("Display Hashmap items using the For Each loop.");
		for(int k : keys){
			System.out.println("KEY : "+k+" VALUE " +map.get(k));
		}
	}

}
