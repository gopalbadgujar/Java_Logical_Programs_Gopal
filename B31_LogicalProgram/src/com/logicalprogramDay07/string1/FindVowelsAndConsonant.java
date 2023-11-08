package com.logicalprogramDay07.string1;

public class FindVowelsAndConsonant {

	
//	Exponent        Class
//	a e i o u
	
	public static void main(String[] args) {
		
		String s="Exponent        Class";
		String s1=s.toLowerCase();
		
		int vCount=0,cCount=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' ||  s1.charAt(i)=='o' || s1.charAt(i)=='u'  ) {
				vCount++;
			}else if(s1.charAt(i)!=' ') {
				cCount++;
			}
			
		}
		
		System.out.println("V : "+vCount+"\nC : "+cCount);
		
	}
	

}
