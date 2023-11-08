package com.logicalprogramDay01;

import java.util.Scanner;

public class OddEven {

	// n = 4
	// 4 % 2 = 0 --EVEN NUMBER
	// 5 % 2 = 1 --ODD NUMBER
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Even Number !");
		}else {
			System.out.println("Odd Number !");
		}
	}	
}
