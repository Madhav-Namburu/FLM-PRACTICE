package com.flm.practice;

public class ReverseSTringbyword {

	public static void main(String[] args) {

		String input = "Nam mara nahi hu";

		String[] words = input.split("\\s+");
		
		String result = "";

		for (String word : words) {
			String reversedWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord += word.charAt(i);
			}
			result += reversedWord + "  " ;

			// Remove the trailing space
			if (!result.isEmpty()) {
				result = result.substring(0, result.length() - 1);
			}

		}
		System.out.println(result);
	}
}
