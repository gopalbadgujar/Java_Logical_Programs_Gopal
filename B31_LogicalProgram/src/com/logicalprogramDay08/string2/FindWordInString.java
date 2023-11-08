package com.logicalprogramDay08.string2;

public class FindWordInString {

	public static void main(String[] args) {

		String s = "dfghsbbjuderid#$*rgckjauo8bpoeqbhfliwkjt";
//		               bb    r      r   a   b    b   i   t

		// rabit

		s = s.replaceAll("[^rabit]", "");
		System.out.println(s);

		System.out.println(s.contains("rabbit"));

	}
}
