package com.tarun;

class Parent {

	String name="Parent";
	String id="s101";
	
	public Parent(String name,String id) {
		this.name=name;
		this.id=id;
	}
	
	//method
	public void parent_method() {
		System.out.println("parent method");
	}
	
	public void m1() {
		System.out.println("m1 .....");
	}
}

class Child extends Parent{

	 String city;
	 
	 public Child(String name,String id,String city) {
		//parent constructor
		super(name, id);
		this.city=city;
	}

	
	
	public void printInfo() {
		System.out.println(name+" "+id+" "+city);
		/*System.out.println(super.id);
		System.out.println("parent class variable:"+super.name);
		super.parent_method();*/
	}
	
}

public class SuperUse {

	public static void main(String[] args) {
		Child c1=new Child("abc","s101","pune");
		
		c1.printInfo();
	}
}