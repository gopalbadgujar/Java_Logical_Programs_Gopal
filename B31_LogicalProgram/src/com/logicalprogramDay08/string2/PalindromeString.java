package com.logicalprogramDay08.string2;

public class PalindromeString {

	// 121 = 121
	// nitin = nitin
	// valva =
	// madam = madam

	public static void main(String[] args) {

		String s = "nitin";

		StringBuffer sb = new StringBuffer(s);
		sb = sb.reverse();

		if (s.equals(sb.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
