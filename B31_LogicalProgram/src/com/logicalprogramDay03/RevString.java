package com.logicalprogramDay03;

public class RevString {

	public static void main(String[] args) {
		
		String str="Logical", revStr=" ";
		char ch;
		
		System.out.print("Original word: ");
		System.out.println("Logical \n"); //Example word
		
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			revStr = ch + revStr ;
		}
		
		System.out.println("Reverse String : "+ revStr);
	}
}
