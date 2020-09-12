package com.telstra.pack1;

public class Stadium {

		public static void main(String[] args) {
			Player P1= new Player();
			Player P2= new Player();
			
			
			int p1Score= P1.play();
			System.out.println(P1.getD1());
			System.out.println(P1.getD2());
			System.out.println(p1Score);
			int p2Score= P2.play();
			System.out.println(P2.getD1());
			System.out.println(P2.getD2());
			System.out.println(p2Score);
			
			if(p1Score > p2Score) {
				System.out.println("P1 won the game");
			}else {
				System.out.println("P2 won the game");
			}
			
		}
}
