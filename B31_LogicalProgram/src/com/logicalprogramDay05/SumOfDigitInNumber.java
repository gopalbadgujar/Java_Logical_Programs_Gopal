package com.logicalprogramDay05;

public class SumOfDigitInNumber {

	// 48953452 >>
//	1234 >> 1+2+3+4=10
//	785= 7+8+5

	public static void main(String[] args) {

		int num = 4567;
		int sum = 0;

		while (num > 0) {
			int a = num % 10;// 7 >> 6 >> 5 >> 4
			sum += a;
			num /= 10;// 456 >> 45 >> 4 >> 0
		}
		System.out.println("Sum is : " + sum);

		System.out.println("===========================================================");

		for (int i = 0; i <= 4; i++) {
			int a = num % 10;
			sum = sum + a;
			num = num / 10;
		}
		System.out.println("Sum is : " + sum);

	}

}
