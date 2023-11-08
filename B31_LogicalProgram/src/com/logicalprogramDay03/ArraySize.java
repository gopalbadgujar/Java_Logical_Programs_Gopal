package com.logicalprogramDay03;

public class ArraySize {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4 ,5};
		int i = 0;
		System.out.print("Integer Array : [");
		
		for(int c:intArr) {
			System.out.print(c+"  ");
			i++;
		}
		System.out.print("] \n");
		
		System.out.println("Size of Array : "+ i);
	}
}
