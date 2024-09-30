package com.tarun;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void printArray(int[][] arr, int r, int c) {
		
		System.out.println("The array:");
		for(int i =0; i< r; i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void inputArray(int[][] arr, int r, int c){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of array:");
		for(int i =0; i< r; i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows in first matrix :");
		int n = sc.nextInt();
		System.out.println("Enter number of colums in fist & rows in second matrix :");
		int l = sc.nextInt();
		System.out.println("Enter number of columns in first matrix :");
		int m = sc.nextInt();
		
		int[][] arr1 = new int[n][l]; 
		int[][] arr2 = new int[l][m]; 
		
		inputArray(arr1, n,l);
		inputArray(arr2, l,m);
		
		printArray(arr1, n,l);
		printArray(arr2, l,m);
		
		int[][] result = new int[n][m];
		
		System.out.println("Multiplication of the above matrices is : ");
		
		for(int i =0; i<n;i++) {
			for(int j=0; j<m; j++) {
				result[i][j] = 0;
				for(int k =0; k<l; k++) {
					result[i][j] += arr1[i][k] * arr2[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}