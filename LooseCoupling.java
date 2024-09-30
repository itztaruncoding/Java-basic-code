package com.tarun;

interface Engine{
	void show();
}

class Diesel implements Engine{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This vehicle is having a diesel engine....");
	}
	
}

class Petrol implements Engine{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This vehicle is having a petrol engine....");
	}
	
} 

class Car2{
	Engine e;
	
	Car2(Engine e){
		e.show();
		this.e = e;
	}
	
	public void run() {
		System.out.println("Car is running on road...");
	}
}

public class LooseCoupling {

	public static void main(String args[]) {
		
		Car2 c = new Car2(new Diesel());
		c.run();
	}
}
