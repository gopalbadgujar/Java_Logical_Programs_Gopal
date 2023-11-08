package com.logicalprogramDay08.string2;

public class FindFirst10PerfectNumber {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; count <= 4; i++) {

			int num = i;
			int sum = 0;

			for (int j = 1; j <= num / 2; j++) {
				if (num % j == 0) {
					sum += j;
				}
			}
			if (num == sum) {
				count++;
				System.out.println(i);

			}

		}

	}

}
