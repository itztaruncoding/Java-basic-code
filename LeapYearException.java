package com.tarun;

import java.util.Scanner;

@SuppressWarnings("serial")
class UserDefiException extends Exception{
	
	UserDefiException(){
	}
}

public class LeapYearException {

	public static void validate(int year) throws UserDefiException{
		if(year%4 != 0 || year%400 != 0) {
			throw new UserDefiException();	
		} else {
			System.out.println("Yeah!! It's a leap year...");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		try {
			validate(year);
		} catch(UserDefiException e){
			System.out.println("Exception occurred");
		}
		
		sc.close();
	}
}