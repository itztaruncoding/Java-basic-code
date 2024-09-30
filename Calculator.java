package com.tarun;

public class Calculator {

	public int cal(int a, int b, int c) {
		return a + b + c;
	}
	
	public double cal(double a, int b) {
		return a - b;
	}
	public double cal(double a,int b, double c, int d) {
		return a * b * c * d;
	}
	
	public int cal(int a, int b) {
		return a / b;
	}
	
	public static void main(String args[]) {
		Calculator c1 =  new Calculator();

		System.out.println(c1.cal(56.5, 23, 4.2, 75));
		System.out.println(c1.cal(48, 62, 34));
		System.out.println(c1.cal(15.0, 5));
		System.out.println(c1.cal(28, 2));
	}
}