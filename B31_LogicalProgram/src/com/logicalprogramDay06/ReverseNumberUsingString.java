package com.logicalprogramDay06;

public class ReverseNumberUsingString {

	public static void main(String[] args) {

		int num = 12145654;

		String s = String.valueOf(num);

		StringBuffer sb = new StringBuffer(s);
		sb = sb.reverse();

		System.out.println("reverse : " + sb);
	}

}
