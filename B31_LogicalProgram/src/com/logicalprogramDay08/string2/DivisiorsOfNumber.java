package com.logicalprogramDay08.string2;

public class DivisiorsOfNumber {

//	9 = 1,3 (4.5)
//	5 = 1
//	45 = 1,3,5,9,15

//	num % div == 0

	public static void main(String[] args) {

		int num = 28;

		for (int i = 1; i <= num / 2; i++) {

			if (num % i == 0) {
				System.out.println(i);
			}

		}

	}

}
