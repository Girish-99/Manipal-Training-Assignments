package com.manipal.bean;

public class Triangle {
	
	private Point t1;
	private Point t2;
	private Point t3;
	public Triangle(Point t1, Point t2, Point t3) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	@Override
	public String toString() {
		return "Triangle [t1=" + t1 + ", t2=" + t2 + ", t3=" + t3 + "]";
	}
	
	
}
