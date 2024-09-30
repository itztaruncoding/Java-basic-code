package com.tarun;

import java.util.Scanner;

interface Shape1{
	void area(double r);
}

class Circle1 implements Shape1{

	@Override
	public void area(double r) {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is : " + (3.14 * r * r));
	}
	
}

public class NewShape{

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		double radius = sc.nextDouble();
		
		Shape1 s = new Circle1();
		
		s.area(radius);
		
		sc.close();
	}
}
