package com.manipal.pack;

public class Singleton {

	private static Singleton singleton_instance= null;
	
	private int x;
	
	public Singleton(int x) {
		this.x= x;
	}
	public static Singleton getInstance( int x) {
		if(singleton_instance== null) {
			singleton_instance= new Singleton(x);
		}
		return singleton_instance;
	}
	@Override
	public String toString() {
		return "Singleton [x=" + x + "]";
	}
	
}
