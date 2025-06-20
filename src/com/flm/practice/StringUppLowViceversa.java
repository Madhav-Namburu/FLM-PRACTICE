package com.flm.practice;

public class StringUppLowViceversa {

	public static String swpcase(String input) {

		if (input == null || input.isEmpty()) {
			return input;
		}
		StringBuilder sb = new StringBuilder(input.length());

		for (char c : input.toCharArray()) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		String original1 = "HELLO";
		String swapped1 = swpcase(original1);
		System.out.println("Original: " + original1);
		System.out.println("Swapped:  " + swapped1);
	}

}
