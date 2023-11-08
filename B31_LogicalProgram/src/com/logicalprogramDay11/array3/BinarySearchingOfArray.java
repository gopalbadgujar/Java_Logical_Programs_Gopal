package com.logicalprogramDay11.array3;

public class BinarySearchingOfArray {

//	4 2 1 5 3
//	1 2 3 4 5
//	f   m   h   s<m  s>m s==m
//	    3 4 5
//	    f m h

//	search = 4 > 3
//	f = m+1

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };// any duplicate

		boolean flag = false;

		int search = 4;

		int f = 0;

		int h = arr.length - 1;

		int i = 0;

		while (f <= h) {
			i++;
			int m = (f + h) / 2;

			if (search == arr[m]) {
				flag = true;
				break;
			} else if (search > arr[m]) {
				f = m + 1;
			} else {
				h = m - 1;
			}

		}

		if (flag) {
			System.out.println("yes : " + i);
		} else {
			System.out.println("no");
		}
	}

}
