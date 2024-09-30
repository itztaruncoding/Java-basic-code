package com.tarun;
import java.util.Scanner;

class CheckNum{
	
	public int isArmstrong(int number) {
		
		int length = 0;
		int ref = number;
		
		while(ref != 0){
			length++;
			ref /= 10;
		}
		
		ref = number;
		int rem;
		int arm = 0; 
		
		while(ref != 0) {
			rem= ref % 10;
			
			int multi = 1;
			for(int i = 1; i <= length; i++) {
				multi *= rem;
			}
			ref /= 10;
			arm += multi;
		}
		
		return arm;
	}
}

class Result extends CheckNum{
	
	public int isArmstrong(int number) {
		
		int armstrong = super.isArmstrong(number);
		
		if(armstrong == number) {
			System.out.println("it's an armstrong number...!");
		} else {
			System.out.println("Not an armstrong number...!");
		}
		
		return armstrong;
	}
}

public class ArmByOverriding {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt(); 
		
		Result r = new Result();
		
		int arm = r.isArmstrong(number);
		
		System.out.println("The result for armstrong number condition is : " + arm);
		
		sc.close();
	}
}