package com.logicalprogramDay09.array1;

public class ElementCount {

public static void main(String[] args) {
		
		int[] arr= {1,5,7,9,0,9,2,4};

		int search=9;
		int count=0;
		
		for(int i:arr) {
			if(i==search) {
				count++;
			}
		}
		
		System.out.println("total count : "+count);
		
	}

}
