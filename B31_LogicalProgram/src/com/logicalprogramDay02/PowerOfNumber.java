package com.logicalprogramDay02;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Power of Number b :");
	    int b = sc.nextInt();
	    
	    int power = 1;
	    
	    for(int i=1; i<=b; i++) {
	    	power = power * a;
	    }
	    
	    System.out.println("Power of a : "+power);
	}
}
