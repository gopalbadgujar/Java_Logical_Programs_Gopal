package com.logicalprogramDay04.starpattern;

//  * 
//  * *
//  * * * 
//  * * * *
//  * * * 
//  * *
//  * 
  
public class C {

	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++) {
			if(i<=4) {
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}		
			}
			else {
				for(int j=3; j>(i-5); j--) {
					System.out.print("* ");
				}	
			}
		
			System.out.println();
		}
	}
}
