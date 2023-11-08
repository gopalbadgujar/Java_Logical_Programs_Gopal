package com.logicalprogramDay05;

public class LargestOfThreeNumber {

//	 45  89  32 
//	a>b && a>c

	public static void main(String[] args) {

		int a = 45, b = 89, c = 89;

		if (a > b && a > c) {
			System.out.println("a is Largest");
		} else if (b > a && b > c) {
			System.out.println("b is largest");
		} else {
			System.out.println("c is largest");
		}

	}

}
