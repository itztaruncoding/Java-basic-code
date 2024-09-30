package com.tarun;

public class Vehicle {
	
	Vehicle(){
		System.out.println("A vehicle is created...!");
	}
	
	Vehicle(int wheel){
		System.out.println("A vehicle is created with " + wheel + " wheels...!");
	}
	
	public void run() {
		System.out.println("A vehicle is running on road...!");
	}
	
	public static void main(String args[]) {
		
		Vehicle car = new Vehicle();
		Vehicle bike = new Vehicle(2);
		
		car.run();
		bike.run();
		
	}
}
