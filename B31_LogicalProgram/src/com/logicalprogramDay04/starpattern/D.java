package com.logicalprogramDay04.starpattern;

//        *
//      * *
//    * * *
//  * * * *

public class D {

	public static void main(String[] args) {
		
		for(int i = 1; i<=4; i++) {
			
			for(int j=3; j>=i; j--) {
				System.out.print("  ");
			}
			
			for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}
			
			System.out.println();
		}
	}
}
