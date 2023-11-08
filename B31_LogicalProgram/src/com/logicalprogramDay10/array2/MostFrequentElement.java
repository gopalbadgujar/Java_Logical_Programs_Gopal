package com.logicalprogramDay10.array2;

public class MostFrequentElement {

	public static void main(String[] args) {

		int arr[] = { 1, 7, 1, 5, 7, 4, 8, 7, 4, 3, 4, 9, 4 };

		int element = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			int tempElement = arr[i];
			int tempCount = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (tempElement == arr[j]) {
					tempCount++;
				}

			}

			if (tempCount > count) {
				element = tempElement;
				count = tempCount;
			}

		}

		System.out.println(element + "  " + count);

	}

}
