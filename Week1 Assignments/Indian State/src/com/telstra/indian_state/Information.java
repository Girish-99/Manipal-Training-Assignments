package com.telstra.indian_state;

public class Information {

	private String State;
//	private static String[][] Places;
	private static String[] Karnataka;
	private static String[] Kerala;
	public Information(String state) {
		this.State= state;
	}
	static {
//		State = new String[] {"Karnataka", "Kerala"};
		Karnataka= new String[]{ "Wonderla", "BigBose" , "Mysore"};
		Kerala= new String[] { "a", "b"};
	}
	
	public static void getPlace(String Place) {
		switch(Place){
			case "Karnataka" : 
				for(String n: Karnataka ) {
					System.out.println(n);
				}
				break;
			case "Kerala" :
				for(String n: Kerala) {
					System.out.println(n);
				}
				break;
			default :
				System.out.println("Enter a Valid State");
				break;
		}
	}
	
	
	
}
