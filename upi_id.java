package com.tarun;

import java.util.*;

public class upi_id extends Exception {

	upi_id(String msg) {
		super(msg);
	}

	static void validUpi(int upi_id1) throws upi_id {
		if (upi_id1 != 1234) {
			throw new upi_id("Upi id is not correct");
		} else {
			System.out.println("Your Upi id is Valid");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upi id");
		int a = sc.nextInt();
		try {
			validUpi(a);
		} catch (upi_id e) {
			System.out.println("exception is occered");
		}
	}
}