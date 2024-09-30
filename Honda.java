package com.tarun;

interface Bike{
	void avg1();
}

interface Car{
	void avg();
}

public class Honda implements Bike,Car{

	public void avg() {
		System.out.println("Avarage of car");
	}

	public void avg1() {
		System.out.println("Avarage of bike");
	}
	
	public void msg() {
		System.out.println("We have achieved multiple inheritance....!");
	}

	public static void main(String args[]) {
		
		Car c1 = new Honda();
		Bike b1 = new Honda();
		
		c1.avg();
		b1.avg1();
	}
}