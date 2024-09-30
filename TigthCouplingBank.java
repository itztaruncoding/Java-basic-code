package com.tarun;

interface Bank1{
	void rateOfInterest();
}

class SBI implements Bank1{

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("Our rate of interest is 7.4 %...");
	}
	
}

class RBI implements Bank1{

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("Our rate of interest is 7.5 %...");
	}
	
}

class Account {
	
	Bank1 b;
	
	Account(Bank1 b){
		System.out.println("Account created...!");
		this.b = b;
		b.rateOfInterest();
	}
	
	public void print() {
		System.out.println("This is my first account!!!");
	}
}

public class TigthCouplingBank {

	public static void main(String args[]) {
		
		Account myAccount = new Account(new SBI());
		
		myAccount.print();
	}
}