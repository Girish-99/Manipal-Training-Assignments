package com.telstra.pack;

public class Car extends Vechile {
 
	private int maxSpeed;
	private int currentSpeed;
	
	

	public Car(String regNo, String type, int maxSpeed, int currentSpeed) {
		super(regNo, type);
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}



	@Override
	public int increaseSpeed(int n) {
		if((currentSpeed+n)<maxSpeed) {
			return currentSpeed+n;
		}else {
			return maxSpeed;
		}
		
	}
	
	
	
}
