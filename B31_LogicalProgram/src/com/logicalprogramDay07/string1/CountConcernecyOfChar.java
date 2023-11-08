package com.logicalprogramDay07.string1;

public class CountConcernecyOfChar {

	
//	Exponent        Class
	//e=2
	
	public static void main(String[] args) {
		
		String s="Exponent        Class";
		
		int count=0;
		
		String s1=s.toLowerCase();
		
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i) == 'e') {
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
