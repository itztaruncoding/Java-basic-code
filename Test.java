package com.tarun;

class UserDefinedException extends Exception {

	//private static String msg;

	public UserDefinedException() {
		//super(msg);
	}
	private static final long serialVersionUID = 1L;	
}

public class Test{

	static void validAge(int age) throws UserDefinedException{
		if(age<18) {
			throw new UserDefinedException();
		} else {
			System.out.println("Yeah!! you can vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			validAge(13);
		} catch(UserDefinedException e){
			System.out.println("Exception occurred");
		}
	}
}