package com.logicalprogramDay05;

public class NumberOfDigitsInNumber {

//	4759643213

//	123

	public static void main(String[] args) {

		int num = 1213465491;
		int count = 0;
		while (num > 0) {

			num = num / 10;
			count++;

		}

		System.out.println("Number of digits is : " + count);

	}

}
