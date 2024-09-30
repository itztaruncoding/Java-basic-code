package com.tarun;

import java.util.Scanner;

public class Table {

	static {
		System.out.println("Printing table of the number number");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n*i);
		}
		
		sc.close();
	}

}