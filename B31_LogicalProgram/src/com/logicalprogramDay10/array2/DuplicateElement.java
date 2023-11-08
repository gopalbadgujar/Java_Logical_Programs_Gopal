package com.logicalprogramDay10.array2;

public class DuplicateElement {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 7, 4, 8, 3, 9 };

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; i < arr.length; j++) {

				if (arr[i] == arr[j]) {
					flag = true;
				}
			}

		}

		if (flag) {
			System.out.println("contains duplicate");
		} else {
			System.out.println("not");
		}

	}

}
