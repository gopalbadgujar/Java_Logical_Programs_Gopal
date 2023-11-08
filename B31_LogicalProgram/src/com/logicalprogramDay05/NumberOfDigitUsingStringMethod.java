package com.logicalprogramDay05;

public class NumberOfDigitUsingStringMethod {

	// 123456 >>> valueOf()

	public static void main(String[] args) {

		int num = 157465;

		String s = String.valueOf(num);

		System.out.println("no. of digit : " + s.length());

	}

}
