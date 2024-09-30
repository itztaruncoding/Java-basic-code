package com.tarun;

interface Calculator{
	
	void addition(double a, double b);
	void sub(double a, double b);
	void multi(double a, double b);
	void div(double a, double b);
}

public class Calculate implements Calculator {

	@Override
	public void addition(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("Additon of numbers is : " +(a+b) );
	}

	@Override
	public void sub(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("Substraction of numbers is : " + (a-b));
	}

	@Override
	public void multi(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication of numbers is : " + (a*b));
	}

	@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("Division of numbers is : " + (a/b));
	}

	public static void main(String args[]) {
		
		Calculator c1 = new Calculate();
		c1.addition(23, 56);
		c1.sub(24, 5);
		c1.multi(25, 5);
		c1.div(48, 4);
	}
}