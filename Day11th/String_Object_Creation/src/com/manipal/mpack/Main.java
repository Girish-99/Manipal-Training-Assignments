package com.manipal.mpack;

public class Main {
	public static void main(String[] args) {
		
		//Creation of string  Object using literals 
		String str="Hello World";
		
		//Creation using new keyword
		
		String str1 = new String("Hello World");
		
		//Creation of string object using char array
		
		char[] ch= {'H', 'E','L', 'L', 'O', 'W', 'O', 'R', 'L', 'D' };
		String str2= new String(ch);
		
		System.out.println("Creation of string using literals " + str);
		System.out.println("Creation using new keyword"+ str1);
		System.out.println("Creation of string object using char array"+ str2);
	}

}
