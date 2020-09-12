package com.telstra.pack1;

import java.util.Random;

public class Dice {
	private int dieValue;
	public int roll(){
		Random rand = new Random();
				dieValue = (int)rand.nextInt(5)+1;
				return dieValue;
	}
	public int getValue() {
		return dieValue;
	}
}
