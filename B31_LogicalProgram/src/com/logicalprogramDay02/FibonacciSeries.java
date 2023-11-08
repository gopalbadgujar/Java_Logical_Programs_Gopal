package com.logicalprogramDay02;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 5;
		int f = 0;
		int s = 1;
		int t = 0;
		System.out.print(f + "  "+ s);
		for (int i = 3; i <= n; i++) {
			t = f + s;
			System.out.print("  " + t);
			f = s;
			s = t;
		}
	}
}
