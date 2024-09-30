package com.tarun;
import java.util.Scanner;

class Area { // it is a java bean class

	private double pi;
	
	public double getPi() {
		return pi;
	}
	
	public void setPi(double pi) {
		this.pi = pi;
	}
}

class Circle {

	
	public void calArea(float rad, double pi) {
		double area = pi * rad * rad;
		
		System.out.println("Area of the circle is : " + area);
	}
}

class Rectangle {

	public void calArea(float a, float b) {
		float area = a * b;
		System.out.println("Area of the rectangle is : " + area);
	}
}

public class CalculateArea {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle : ");
		float rad = sc.nextFloat();

		System.out.println("Enter the length of the rectangle : ");
		float length = sc.nextFloat();
		
		System.out.println("Enter the width of the rectangle : ");
		float width = sc.nextFloat();
		
		Area a1 = new Area();
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		a1.setPi(3.14);
		double pi = a1.getPi();
		
		c1.calArea(rad, pi);
		r1.calArea(length,width);
		
		sc.close();
	}
}
