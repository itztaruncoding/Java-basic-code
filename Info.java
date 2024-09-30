package com.tarun;

class College {

	String collegeName;
	String dept;
	int id;
	
	College(){
		System.out.println("College's object is created");
	}
	
	public void collegeInfo(String dept, int id ) {
		System.out.println("Department is: " + dept + "\nID is : " + id);
	}
}

class MCA extends College {

	String bg;
	
	MCA(){
		
		System.out.println("MCA object created");
	}
	
	public void printBG(String bg) {
		System.out.println("Background is : " + bg);
	}
}

class BTech extends MCA {

	BTech(){
		
		System.out.println("This is BTech's object");
	}
}
public class Info {

	public static void main(String args[]) {
		BTech b1 = new BTech();
		
		b1.printBG("Computer Science");
		b1.collegeInfo("CSE", 2);
	}
}
