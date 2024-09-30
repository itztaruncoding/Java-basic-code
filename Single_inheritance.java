package com.tarun;


class Activa {

	String name;
	double price;

	Activa() {
		System.out.println("I have a petrol engine");
	}

	public void bill(String name, double price) {
		System.out.println("Name is : " + name + " price is : " + price);
	}
}

class ActivaPlus extends Activa {

	ActivaPlus() {

		System.out.println("I have petrol engine and also self start feature");
	}
}


public class Single_inheritance {
	public static void main(String args[]) {

		ActivaPlus a1 = new ActivaPlus();

		a1.bill("Activa Plus", 50000);
	}
}
