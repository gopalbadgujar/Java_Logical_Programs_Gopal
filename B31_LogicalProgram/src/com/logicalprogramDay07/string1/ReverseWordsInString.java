package com.logicalprogramDay07.string1;

public class ReverseWordsInString {

//	hello good morning
//	olleh doog gninrom

	public static void main(String[] args) {

		String str = "hello good morning";

		String[] sArr = str.split(" ");

		String reverseString = "";

		for (String s : sArr) {

			StringBuffer sb = new StringBuffer(s);
			sb = sb.reverse();
			reverseString = reverseString + sb + " ";
		}

		System.out.println(reverseString);

	}

}
