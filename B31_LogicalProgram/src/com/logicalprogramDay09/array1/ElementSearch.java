package com.logicalprogramDay09.array1;

public class ElementSearch {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 9, 0, 9, 2, 4 };

		int search = 4;

		boolean flag = false;

		for (int i : arr) {
			if (i == search) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("contains");
		} else {
			System.out.println("not found");
		}

	}

}
