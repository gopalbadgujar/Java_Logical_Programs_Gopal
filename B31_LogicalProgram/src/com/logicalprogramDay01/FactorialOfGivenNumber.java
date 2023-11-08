package com.logicalprogramDay01;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	// n = 5;
	// 1 * 2 * 3 * 4 * 5 = 120
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int fact = 1;
		int i;
		for(i=1;i<=n;) {
//			fact = fact * i;
			fact *= i;
			i++;
		}
		System.out.println("Factorial of Given Number : " + fact);
	}
}
