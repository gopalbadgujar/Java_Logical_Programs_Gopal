package com.logicalprogramDay06;

public class PalindromeNumber {

//	121
//	456654
//	258852

//	num == rev
//	121 == 121
//	4524 != 4254

	public static void main(String[] args) {

		int num = 45685654;
		int originalNumber = num;
		int rev = 0;

		while (num > 0) {
			int a = num % 10;
			rev = rev * 10 + a;
			num /= 10;
		}

		if (originalNumber == rev) {
			System.out.println("It is a palindrome number");
		} else {
			System.out.println("It's not a palindrome");
		}

	}

}
