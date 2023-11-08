package com.logicalprogramDay09.array1;

import java.util.Arrays;

public class ReverseArray {

//	   1  5  8  7  4
//	0  4  5  8  7  1   arr[i]=arr[arr.length-1-i]
//	1  4  7  8  5  1   arr[i]=arr[arr.length-1-i]
//	2  4  7  8  5  1   arr[i]=arr[arr.length-1-i] 5-1-2=2
//	3  

	public static void main(String[] args) {

		int[] arr = { 1, 5, 8, 7, 4 };

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}

		System.out.println(Arrays.toString(arr));

	}

}
