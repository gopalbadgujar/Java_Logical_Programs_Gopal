package com.logicalprogramDay07.string1;

public class StringReverse {

	
	public static void main(String[] args) {
		
		String s="abc";
		String revA="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			revA=revA+s.charAt(i);
			
		}
		
		System.out.println(revA);
	}
}
