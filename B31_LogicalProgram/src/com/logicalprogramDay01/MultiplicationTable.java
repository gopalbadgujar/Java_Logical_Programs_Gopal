package com.logicalprogramDay01;

import java.util.Scanner;

public class MultiplicationTable {

	// n = 2;
	// 2*1 = 2
	// 2*2 = 4
	// 2*3 = 6
	// 2*4 = 8
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int  n = sc.nextInt();
		
		for( int i = 1; i<=10; i++) {
			int result = n * i;
			System.out.println(n + " X " + i + "=" + result );
		}
	}
}
