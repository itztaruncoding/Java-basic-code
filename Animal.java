package com.labs;

import java.util.Scanner;

public class Animal {
	public void MakeSound() {
		System.out.println("Animal makes a Sound");
	}
	 public static  void main(String[]args) {
		 Animal a= new Animal();
		  a.MakeSound();
		 System.out.println("Choose animal cat or dog");
		 Scanner sc =new Scanner (System.in);
		 String c = sc.nextLine();
		 if(c.equals("cat")) {
			 Animal cat =new Cat();
			 cat.MakeSound();
		 }
		 else if ( c.equals("dog")) {
			 Animal dog =new Dog();
			 dog.MakeSound();
		 }
		 else {
			 System.out.println("invaild animal");
		 }
		 
		 
	 }
}
class Dog extends Animal{
	@Override
	public void MakeSound() {
		System.out.println("Dog makes a Sound : Barks");
	}
	
}
class Cat extends Animal{
	@Override
	public void MakeSound() {
		System.out.println("Cat makes a Sound: Meows");
	}
}
