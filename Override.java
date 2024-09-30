package com.tarun;

class ParentMethodOverriding {

	String name;
	
	//method
	public void print_info(String name) {
		System.out.println("name of parent = "+name);
	}
} 

class ChildMethodOverriding {

	public void print_info(String name) {
		System.out.println("Child name : "+name);
	}
}

public class Override {

	public static void main(String[] args) {
		ChildMethodOverriding c1=new ChildMethodOverriding();
		//c1.name="child";
		c1.print_info("child");
	}
}
