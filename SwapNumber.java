package com.tarun;

public class SwapNumber {

	public static void main(String args[]) {
		
		int num1 =48 ;
		int num2 = 97;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swapping number 1 : " + num1);
		System.out.println("After Swapping number 2 : " + num2);
	}
}
