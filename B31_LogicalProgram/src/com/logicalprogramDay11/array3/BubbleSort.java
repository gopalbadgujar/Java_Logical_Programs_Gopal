package com.logicalprogramDay11.array3;

import java.util.Arrays;

public class BubbleSort {

//	756494216
//	12      9

//	4 2 1 5 3      i=0 > i+1

//	2 4 1 5 3      1st > 2nd
//	2 1 4 5 3
//	1 2 4 5 3
//	1 2 4 3 5

//	1 2 3 4 5

	public static void main(String[] args) {

		int[] arr = { 4, 2, 1, 5, 3, 9 };

		int n = arr.length - 1;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
