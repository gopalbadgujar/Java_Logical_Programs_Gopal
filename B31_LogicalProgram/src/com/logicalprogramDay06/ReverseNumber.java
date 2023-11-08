package com.logicalprogramDay06;

public class ReverseNumber {

//	1234   >> 4321

//	1000         1
//	 200        20
//	  30       300
//	   4      4000

	public static void main(String[] args) {

		int num = 1234;
		int orginalNum = num;
		int rev = 0;

		while (num > 0) {

			int a = num % 10;// 4 //3 //2 //
			rev = rev * 10 + a;// 0*10+4=4 //4*10+3=43 //43*10+2=432
			num = num / 10;// 123 //12 //1

		}

		System.out.println("Num : " + orginalNum + "\nReverse : " + rev);
	}

}
