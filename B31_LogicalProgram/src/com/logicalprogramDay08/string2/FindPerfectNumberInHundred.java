package com.logicalprogramDay08.string2;

public class FindPerfectNumberInHundred {

	
//	1-100
	
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			
			int num=i;
			int sum=0;
			
			for(int j=1;j<=num/2;j++) {
				if(num%j==0) {
					sum+=j;
				}
			}
			
			if(sum== num) {
				System.out.println(i);
			}
			
		}
		
		
	}
}
