package com.logicalprogramDay11.array3;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayUsingMethods {

	public static void main(String[] args) {

		Integer[] arr = { 4, 2, 1, 5, 3, 9 };

//		Arrays.parallelSort(arr);
//		Arrays.sort(arr);

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println(Arrays.toString(arr));

	}

}
