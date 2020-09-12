package com.telstra.pack1;

public class Player {
	
	private Dice D1;
	private Dice D2;
	
	public Player() {
		super();
		
		D1= new Dice();
		D2= new Dice();
	}
	
	public int getD1() {
		return D1.getValue();
	}

	public int getD2() {
		return D2.getValue();
	}

	public int play() {
		// TODO Auto-generated method stub
		return (D1.roll()+D2.roll());
	}
	
	
	

}
