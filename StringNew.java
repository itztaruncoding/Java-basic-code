package com.tarun;

public class StringNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Hello there");
		String s = "String literal";
		
		boolean result  = s1.equals(s);
		System.out.println(result);
		
		boolean check = s.contains("ring");
		System.out.println(check);
		
		System.out.println(s.length());
		
		System.out.println(s.substring(7, s.length()));
		
		System.out.println(String.join(s, "Example"));
		
		System.out.println(s1.split("t",4));
		
		System.out.println(s.indexOf("i"));
		/*System.out.println(s.charAt(2));
		System.out.println(s1.charAt(1));
	
		System.out.println(s1.replace('H', 'J'));
		System.out.println(s.replace('S', 'V'));
		
		
		System.out.println(s.toUpperCase());*/
		}
}