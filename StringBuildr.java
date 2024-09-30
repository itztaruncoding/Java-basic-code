package com.tarun;

public class StringBuildr {

	public static void main(String args[]) {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.capacity());
		sb.append("Hello ");
		sb.append("Java");	
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		sb.insert(0, "y");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" Welcome!!! Let's start programming..");
		System.out.println(sb);
		System.out.println(sb.capacity());
		}
}
