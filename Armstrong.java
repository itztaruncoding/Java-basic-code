package com.tarun;
import java.util.Scanner;

public class Armstrong {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is an armstrong number :");
		int realNum = sc.nextInt();
		int num = realNum;
		int length = 0;
		
		while(num != 0) {
			length++;
			num = num/10;
		}
		System.out.println("Length of the number entered is :"+length);
		
		num = realNum;
		int arm = 0,rem;
		
		while(num != 0) {
			int multi = 1;
			rem = num % 10;
			
			for(int i = 1; i <= length; i++) {
				multi = multi * rem;
			}
			arm = arm + multi;
			num = num / 10;
		}
		
		if(arm == realNum) {
			System.out.println("The input number is an armstrong number...!");
		} else {
			System.out.println("The input number is not an armstrong number...!");
		}
		
		sc.close();
	}
}