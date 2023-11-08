package com.logicalprogramDay05;

public class LargestOfThreeNumberUsingTurneryOperator {

//	a>b ? a : b

	public static void main(String[] args) {

		int a = 45, b = 89, c = 32;

//		int largest = (a>b ? a : b);
//		largest= largest>c ? largest : c;

		int largest = (a > b ? a : b) > c ? (a > b ? a : b) : c;

		System.out.println(largest);
	}

}
