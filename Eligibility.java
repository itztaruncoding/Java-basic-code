package com.dp.encap;

import java.util.Scanner;

class Person{
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
public class Eligibility {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		Person p1 = new Person();
		
		p1.setAge(age);
		int pAge = p1.getAge();
		
		if(pAge <= 24) {
			System.out.println("Congratulations....! You are eligible for the course");
		} else {
			System.out.println("Oops! You are not eligible for the course...");
		}
		
		sc.close();
	}
}