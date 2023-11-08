package com.logicalprogramDay08.string2;

public class RemoveSpeacialCharFromString {

	public static void main(String[] args) {

		String s = "dfghjk5489%*&#@!";

		s = s.replaceAll("[^A-Za-z0-9]", "");

		System.out.println(s);
	}

}
