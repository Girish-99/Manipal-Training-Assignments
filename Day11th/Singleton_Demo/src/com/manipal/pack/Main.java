package com.manipal.pack;

public class Main {

	public static void main(String[] args) {
		Singleton s1= Singleton.getInstance(10);
		System.out.println(s1);
		
		Singleton s2= Singleton.getInstance(30);
		System.out.println(s2);
		Singleton s3= Singleton.getInstance(40);
		System.out.println(s3);
	}

}
