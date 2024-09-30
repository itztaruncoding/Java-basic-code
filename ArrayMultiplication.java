package com.tarun;

public class ArrayMultiplication {

	public static void main(String[] args) {
		
		int arr1[][] = {{1,2},{2,3}};
		int arr2[][] = {{5,2},{4,1}};
		
		int result[][] = new int[2][2];
		
		System.out.println("Multiplication of the above matrix is: ");
		
		for(int i =0; i<2; i++) {
			for(int j=0;j<2;j++) {
				for(int k=0; k<2; k++) {
					result[i][j] += arr1[i][k] * arr2[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
