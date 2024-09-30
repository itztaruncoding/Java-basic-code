package com.tarun;

public class Employee {

	String name;
	int id;
	int salary;
	String desg;
	
	
	public void printInfo(String name, int id) {
		System.out.println("Employee Name is : "+ name + " Employee ID is : "+ id);
	}
	
	public void printInfo( int id , int salary) {
		System.out.println( " Employee ID is : "+ id + "Employee salary is : "+ salary );
	}
	
	public void printInfo(String name, String desg) {
		System.out.println("Employee Name is : "+ name + " Employee desg is : "+ id);
	}
	
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e2.printInfo(15, 40000);
		
		e1.printInfo("Honey", 22);
		
	}
}
