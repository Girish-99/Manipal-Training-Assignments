package com.telstra.pack;

public abstract class Vechile implements Automobile {

	protected String regNo;
	protected String type;
	
	
	public Vechile(String regNo, String type) {
		super();
		this.regNo = regNo;
		this.type = type;
	}

	@Override
	public String start() {
		return "Vechile is Started";
	}

	@Override
	public abstract int increaseSpeed(int n);
	
	@Override
	public String stop() {
		return "Vechile is Stoped";
	}

	
}
