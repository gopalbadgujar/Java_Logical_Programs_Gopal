package com.logicalprogramDay09.array1;

public class EvenAndOdd {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 9, 0, 9, 2, 4 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.print(" " + arr[i]);
			}

		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(" " + arr[i]);
			}
		}

	}

}
