package com.logicalprogramDay07.string1;

public class FindSpecialCharInString {

	//Exponent# $ %
	
	
		public static void main(String[] args) {
			
			String s="Exponent# $ %";
			
			
			String s1=s.replaceAll("[^A-Za-z0-9]", "");
			
			System.out.println(s1);
			
			
		}
}
