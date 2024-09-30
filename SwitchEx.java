package com.tarun;
import java.util.Scanner;

public class SwitchEx {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		System.out.println("Enter the operation from 1 to 5");
		int op = sc.nextInt();
		
		switch(op) {
		
		case 1 : 
			System.out.println("Addition of above number is : " + (a+b));
			break;
		
		case 2 : 
			System.out.println("Difference of above number is : " + (a-b));
			break;
	
		case 3 : 
			System.out.println("multiplication of above number is : " + (a*b));
			break;

		case 4 :	 
			System.out.println("Division of above number is : " + (a/b));
			break;

		case 5 : 
			System.out.println("Mod of above number is : " + (a%b));
			break;
			
		default : 
			System.out.println("Invalid button...!");
		}
		
		sc.close();
	}
}