package com.labs;

import java.util.HashMap;

public class checkhashmap {
public static void check(HashMap<Integer, String> hm) {
		
		if(hm.isEmpty()) {
			System.out.println("HashMap doesn't contain any key map pair..!!!");
		} else {
			System.out.println("HashMap is not empty...");
		}
	}

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		// add elements
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		System.out.println(hm); // prints hashmap
		//remove element
		hm.remove(4);
		check(hm); // if hash  map is empty
		System.out.println(hm); // prints hash map
		hm.clear();
		check(hm); // if hash map is empty
		System.out.println(hm); // prints hash map
	}
}
