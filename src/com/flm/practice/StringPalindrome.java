package com.flm.practice;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "madam";
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		boolean ispalindrome = str.equals(reversed);
		System.out.println(str + " is Palindrome " + ispalindrome);
	}
}
