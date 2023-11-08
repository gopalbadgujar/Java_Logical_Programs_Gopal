package com.logicalprogramDay02;

public class SwappingOfNumbersUsingThirdVariable {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 22;
		int c;
		
		System.out.println(a+"   "+ b);
		System.out.println("Before Swapping");
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping");
		System.out.println(a+"   "+ b);
	}
}
