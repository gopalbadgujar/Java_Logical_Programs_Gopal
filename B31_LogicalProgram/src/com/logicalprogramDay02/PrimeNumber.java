package com.logicalprogramDay02;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = sc.nextInt();

		boolean flag = false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(n + " is not prime number.");
		}else {
			System.out.println(n + " is prime number.");
		}

	}
}
