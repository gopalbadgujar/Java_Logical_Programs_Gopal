package com.logicalprogramDay03;

public class Pattern5 {

	public static void main(String[] args) {

		int n = 4;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				int count = i + j;
				if (count % 2 == 0) {
					System.out.print(1 + "  ");
				} else {
					System.out.print(0 + "  ");
				}
			}
			System.out.println();
		}
	}
}
