package com.telstra.pack;

public class Main {

	public static void main(String[] args) {
		
		Car c1= new Car("KA42Ec", "Diesel", 100, 120);
		System.out.println(c1.start());
		System.out.println(c1.increaseSpeed(100));
		System.out.println(c1.stop());
		

	}

}
