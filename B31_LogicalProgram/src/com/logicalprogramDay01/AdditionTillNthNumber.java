package com.logicalprogramDay01;

import java.util.Scanner;

public class AdditionTillNthNumber {

	// n = 5
	// 5+4+3+2+1 = 15
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
		sum += i;	
		}
		System.out.println("Sum of Number is : "+ sum);
	}
}
