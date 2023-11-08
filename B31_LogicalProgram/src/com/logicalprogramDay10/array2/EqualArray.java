package com.logicalprogramDay10.array2;

import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 9, 0, 9, 2, 4 };
		int[] arr1 = { 1, 5, 7, 9, 0, 9, 4 };

		System.out.println(Arrays.equals(arr, arr1));

	}
}
