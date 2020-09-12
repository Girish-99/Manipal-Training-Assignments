package com.telstra.bank;

public class Main {

	public static void main(String[] args) {
		Bank B1= new Bank(123, "Girish");
//		String option = args[0];
		String option = "debit";
		 if(option == "credit") {
			 System.out.println("Your Current Balance is :" +B1.credit(10000) ); 
		 }else {
			 System.out.println("Your Current Balance is :" +B1.debit(100) ); 
		 }
		
		
	}

}
