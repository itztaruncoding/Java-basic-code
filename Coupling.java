package com.tarun;

class PetrolEngine{
	public void show() {
		System.out.println("Petrol engine...");
	}
}

class DieselEngine{
	public void show() {
		System.out.println("Diesel engine...");
	}
}

class Car1{
	
	DieselEngine e ;
	
	Car1(){
		e = new DieselEngine();
	}
	
	public void run() {
		e.show();
		System.out.println("Car is running...");
	}
}

public class Coupling {

	public static void main(String args[]) {
		
		Car1 c = new Car1();
		c.run();
	}
}
