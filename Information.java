package com.tarun;

import java.util.Scanner;
/*
Person(name,id,city)
Employee(name,city,sal)(inherit person)
Student(name,roll_no,dept)(inherit employee class)

*/

class Person{
	String name;
	int id;
	String city;
	
	Person(){
		System.out.println("Person's constructor called...!");
	}
	
	public void pInfo(String name, int id, String city) {
		System.out.println("Name : " + name + "\nid : " + id +"\nCity : " + city);
	}
}

class Employeee extends Person{
	double salary;
	
	Employeee(){
		System.out.println("Employee's constructor called...!");
	}
	
	public void eInfo(String name, int id, double salary) {
		System.out.println("Name : " + name + "\nid : " + id +"\nSalary : " + salary);
	}
}

class Student_ extends Employeee{
	int roll_no;
	String dept;
	
	Student_(){
		System.out.println("Student's constructor called...!");
	}
	
	public void sInfo(String name, int id, int roll_no, String dept, String city ) {
		System.out.println("Name : " + name + "\nid : " + id + "\nRoll number : " + roll_no + "\nDepartment : " + dept + "\nCity : " + city);
	}
	
}
public class Information {

	public static void main(String args[]) {
		Student_ s1 = new Student_();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		s1.name = sc.nextLine();
		System.out.println("Enter department : ");
		s1.dept = sc.nextLine();
		System.out.println("Enter city : ");
		s1.city = sc.nextLine();
		System.out.println("Enter ID : ");
		s1.id = sc.nextInt();
		System.out.println("Enter roll number : ");
		s1.roll_no = sc.nextInt();
		
		s1.sInfo(s1.name, s1.id, s1.roll_no, s1.dept, s1.city);
		
		s1.eInfo(s1.name, s1.id, 75000);
		
		s1.pInfo(s1.name, s1.id, s1.city);
		
		sc.close();
	}
}