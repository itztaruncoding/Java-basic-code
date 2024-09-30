package com.dp;


public class ExceptionNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10/0;
		} catch(Exception e) {
			
			System.out.println(	e.toString());
			System.out.println();
			System.out.println(e.getMessage());
		}
	}
}