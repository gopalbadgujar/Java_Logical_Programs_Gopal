package com.logicalprogramDay09.array1;

public class MaxAndMinValue {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 9, 0, 9, 2, 4 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}

		System.out.println(max);

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println(min);

	}
}
