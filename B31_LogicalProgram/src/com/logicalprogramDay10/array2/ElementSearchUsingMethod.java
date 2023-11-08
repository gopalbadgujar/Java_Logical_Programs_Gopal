package com.logicalprogramDay10.array2;

import java.util.Arrays;

public class ElementSearchUsingMethod {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 9, 0, 9, 2 };

		int value = Arrays.binarySearch(arr, 4);

		System.out.println(value);

	}
}
