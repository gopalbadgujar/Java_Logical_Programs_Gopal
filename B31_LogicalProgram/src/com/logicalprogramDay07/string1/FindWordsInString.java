package com.logicalprogramDay07.string1;

public class FindWordsInString {

	
//	Welcome to Exponent Class
	
//	c1==' '  c2 != ' '
	
	public static void main(String[] args) {
		
		String s="  A  Welcome to      Exponent Class     ";
		
		s=s.trim();
//		
//		String[] sArr=s1.split(" ");
//		
//		System.out.println(sArr.length);
		
		int count=1;
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	

}
