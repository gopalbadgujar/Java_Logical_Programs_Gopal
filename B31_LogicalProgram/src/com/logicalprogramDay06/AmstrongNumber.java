package com.logicalprogramDay06;

public class AmstrongNumber {

//	153 = 3
//	1^3 + 5^3 + 3^3 = 153
//	1   + 125 + 27  = 153

//	13=2
//	1^2 + 3^2 = 10 

//	2 = 1
//	2^1 = 2

//	1,2,3,4,5,6,7,8,9

	public static void main(String[] args) {

		int num = 2;
		int temp = num;
		int count = 0;

		while (temp != 0) {
			temp /= 10;
			count++;
		}

		temp = num;
		int totalSum = 0;
		while (temp > 0) {

			int a = temp % 10;
			int sum = 1;

			for (int i = 1; i <= count; i++) {
				sum = sum * a;// 1*3=3 //3*3=9 //9*3=27
			}

			totalSum = totalSum + sum;
			temp = temp / 10;

		}

		if (num == totalSum) {
			System.out.println("its an amstrong number");
		} else {
			System.out.println("It's not");
		}
	}

}
