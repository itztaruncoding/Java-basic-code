package com.tarun;

public class Student {

	String name;
	String dept;
	int rollNo;
	String loc;
	
	public void print_Info(String name, String dept) {
		
		System.out.println("Name is : " + name + " \nDepartment is : " + dept );
	}
	
	public void print_Info(String name, String dept, String loc) {
		
		System.out.println("Name is : " + name + " \nDepartment is : " + dept + "\nLocation is : " + loc);
	}
	
	public void print_Info(String name, int rollNo, String loc) {
		
		System.out.println("Name is : " + name + " \nRoll number is : " + rollNo + "\nLocation is : " + loc);
	}
	
	public void print_Info(int rollNo) {
		
		System.out.println(" \nRoll number is : " + rollNo );
	}
	
	public static void main(String args[]) {
		Student s1 = new Student();
		
		s1.name = "John";
		s1.dept = "CSE";
		s1.loc = "Bhopal";
		
		s1.print_Info(s1.name, s1.dept, s1.loc);
		
		Student s2 = new Student();
		
		s2.print_Info("Max", 15, "Indore");
		
		s1.print_Info(18);
	}
}