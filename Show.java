package com.tarun;

abstract class Shape{
	
	public void msg() {
		System.out.println("Msg from abstract class Shape..!");
	}
	
	abstract void area(int r);
}

class Circle extends Shape{
	
	int rad;

	
	void area(int r) {
		
		double area = 3.14 * r *r;
		
		System.out.println("Area of the circle is : " + area);
	}

}

public class Show {
	
	public static void main(String args[]) {
		
		Shape s1 = new Circle();
		s1.msg();
		s1.area(5);
	}
}