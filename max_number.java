package com.labs;
import java.util.Scanner;

public class max_number {
	max_number(int a,int b){
		int c = (a>b)?a:b;
		System.out.println("the maximum number is:" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second  number");
		int b = sc.nextInt();
		max_number max = new max_number(a,b);
		
		
		

	}

}
