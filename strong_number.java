package com.labs;


import java.util.Scanner;  
public class strong_number  
{  
	
	public  int number(int n){
		int sum=0;
		while (n > 0)  
		{  
		int last_digit = n % 10;  	   
		int fact=1;  
		for(int i=1; i<=last_digit; i++)  
		{  
		fact=fact*i;  
		}  
			 sum = sum + fact;  
		
		n = n / 10;  
		}  
		return(sum);		
	}
	
public static void main(String[] args)   
{  

Scanner sc=new Scanner(System.in);  
System.out.println("Enter the number: "); 
int number=sc.nextInt();   
int n=number;  
int s;
 strong_number sn = new strong_number();
s= sn.number(n);
 if(number==s) {
	 System.out.println(s+" "+"the number is strong number");
 }
 else{
 System.out.print(s + " " + "the number is not strong number");
 }
 
}
}  