package com.labs;

public class bank {
	
	     double amount;


	    public bank(double amount) {
	        this.amount = amount;
	    }

	    
	    public void withdraw(double withdrawalAmount) {
	        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
	        if (withdrawalAmount <= amount) {
	            amount = amount-withdrawalAmount;
	        }
	        System.out.println(message);
	    }

	   
	    public void deposit(double depositAmount) {
	        amount = amount + depositAmount;
	    }

	  
	    public void displayBalance() {
	        System.out.println("Total balance: " + amount);
	    }

	    public static void main(String[] args) {
	        
	        bank account = new bank(10000);
	        
	        account.withdraw(5000);
	      
	        account.deposit(5000);

	      
	        account.displayBalance();
	    }
	}
	