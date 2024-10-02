package com.labs;

import java.util.HashMap;
import java.util.Scanner;

public class cricketermapinterface {
	public static void main(String[] args) {
		// map storing name and score of cricketer
		HashMap<String, Integer> cricketer = new HashMap<>();
		// put elements in map
		cricketer.put("Rohit", 102);
		cricketer.put("kholi", 56);
		cricketer.put("gill", 85);
		cricketer.put("bhumra", 94);
		cricketer.put("Rahul", 33);
		//If we input our search for batsman
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of batsman whose score you want to see :");
		String batsman = sc.nextLine();
		// here we can get the score
		System.out.println(cricketer.get(batsman));
		
	}
}
