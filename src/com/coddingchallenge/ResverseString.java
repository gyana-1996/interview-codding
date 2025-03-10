package com.coddingchallenge;

/*
 * Approaches
 *  1- StringBuilder
	2- For Loop
	3- Using char[] Array
	4- Using Recursion*/

public class ResverseString {

	public static void main(String[] args) {
		// 1- StringBuilder
		String str = "java";
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		System.out.println("Revrese Using String Buffer : " + stringBuilder);
		// 2- For Loop
		String strForLoop = "Java";
		String reverseLoop = "";
		for (int i = strForLoop.length() - 1; i >= 0; i--) {
			reverseLoop = reverseLoop + str.charAt(i);
		}
		System.out.println("Revrese Using For Loop : " + reverseLoop);
	}
}
