package com.tarun;

public class NullRefException {

	public static void main(String[] args) {
		String name = null;
		
		try {
			int len = name.length();
			System.out.println(len);
		} catch(Exception e){
			System.out.println("Exception caught : " + e);
		}
		
		
		System.out.println("This is the important part of code to execute");
	}

}
