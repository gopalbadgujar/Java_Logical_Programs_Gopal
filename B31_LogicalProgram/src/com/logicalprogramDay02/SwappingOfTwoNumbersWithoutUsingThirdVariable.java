package com.logicalprogramDay02;

public class SwappingOfTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 22;
		
		System.out.println(a+"   "+b);
		System.out.println("Before Swapping");
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping");
		System.out.println(a + "   "+ b);
	}
}
