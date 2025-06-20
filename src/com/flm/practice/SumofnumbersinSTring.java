package com.flm.practice;

import java.util.Arrays;

public class SumofnumbersinSTring {

	public static int sumOddAddEvenSubtract(String[] numberStrings) {

		if (numberStrings == null || numberStrings.length == 0) {
			return 0;
		}
		int totalSum = 0;
		for (String str : numberStrings) {
			if (str == null || str.trim().isEmpty()) {
				continue;
			}
			int number = Integer.parseInt(str.trim());
			if (number % 2 == 0) {
				totalSum -= number;
			} else {
				totalSum += number;
			}
		}
		return totalSum;
	}
	public static void main(String[] args) {
		String[] array1 = { "5", "10", "3", "2", "7" };
		// Calculation: +5 - 10 + 3 - 2 + 7 = 3
		int result1 = sumOddAddEvenSubtract(array1);
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Result 1: " + result1); // Expected: 3
		System.out.println("--------------------");
	}
}