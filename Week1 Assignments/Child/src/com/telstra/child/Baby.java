package com.telstra.child;

public class Baby {

	private double weight;
	
	public Baby(double weight){
		this.weight= weight;
	}
	
	public void babyHealth() {
		if(this.weight>1.5 &&  this.weight < 3) {
			System.out.println("Baby is Healthy");
		}else if(this.weight<1.5) {
			System.out.println("Baby is undernurished");
		}else {
			System.out.println("Baby is overnurished");
		}
	}
}
