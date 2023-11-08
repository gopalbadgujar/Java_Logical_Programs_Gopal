package com.logicalprogramDay08.string2;

public class PerfectNumber {


//	28 = 1+2+4+7+14 = 28
//	6  = 1+2+3      = 6
//	1  = 1          = 1
	
	public static void main(String[] args) {
		
		int num=78;
		
		int sum=0;
		
		for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				sum+=i;
			}
			
		}
		
		if(num==sum) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
	}
	
}
