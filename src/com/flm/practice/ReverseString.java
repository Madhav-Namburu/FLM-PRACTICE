package com.flm.practice;

public class ReverseString {

	public static void main(String[] args) {
		String str ="Madhav";
		char[] chars = str.toCharArray();

		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i] + " ");
		}
	}

}
