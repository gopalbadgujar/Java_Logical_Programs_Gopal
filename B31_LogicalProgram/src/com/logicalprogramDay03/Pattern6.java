package com.logicalprogramDay03;

public class Pattern6 {

public static void main(String[] args) {
		
		int n = 4;
		int c = 64;
		for(int i=1; i<=n; i++){
         
			for(int j = 1; j<=i; j++) {
				System.out.print((char)(c+j)+"  ");
			}
			System.out.println();
		}
	}
}
