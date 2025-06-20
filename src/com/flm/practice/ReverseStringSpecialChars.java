package com.flm.practice;

public class ReverseStringSpecialChars {

	public static String reverseStringWithoutMovingSpecialChars(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			if (!Character.isLetterOrDigit(charArray[left])) {
				left++;
			} else if (!Character.isLetterOrDigit(charArray[right])) {
				right--;
			} else {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		String input1 = "a!b@c#d$ef";
		String reversed1 = reverseStringWithoutMovingSpecialChars(input1);
		System.out.println("Original string: " + input1);
		System.out.println("Reversed string: " + reversed1); // Output: e!d@c#b$a

	}

}
