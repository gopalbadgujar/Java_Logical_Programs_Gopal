package com.logicalprogramDay10.array2;

public class CharInArray {

	public static void main(String[] args) {

		int arr[] = { 11, 121, 18, 51, 96, 75, 31 }; // 1 >> 7

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			int temp = arr[i];

			String s = String.valueOf(temp);

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1') {
					count++;
				}
			}

//			while(temp!=0) {
//				int a=temp%10;
//				if(a==1) {
//					count++;
//				}
//				temp=temp/10;
//			}

		}

		System.out.println(count);

	}

}
