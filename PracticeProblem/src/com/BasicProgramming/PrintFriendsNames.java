package com.BasicProgramming;

/*
 1. Write a program “PrintFriendsNames” that takes 3 friends’ names as input
arguments and prints out “Hi” to these friends in the reverse of the order given. It
also adds “and “ before the last name. 
For example:

Input Arguments : Mahesh, Suresh, Devesh

Output : “Hi Devesh, Suresh and Mahesh”
 */

public class PrintFriendsNames {

//	String[] str = { "Mahesh", "Suresh", "Devesh" };

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Please provide exactly 3 friend names as input arguments.");
			return;
		}

		String friend1 = args[2];
		String friend2 = args[1];
		String friend3 = args[0];

		// Concatenate the friends' names in reverse order with "and" before the last
		// name
		String message = "Hi " + friend3 + ", " + friend2 + " and " + friend1;
		System.out.println(message);
	}

}
