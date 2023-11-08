package com.logicalprogramDay09.array1;

public class SumofElementsArray {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 9, 0, 9, 2, 4 };

		int sum = 0;

		for (int i : arr) {
			sum += i;
		}

		System.out.println(sum);
	}

}
