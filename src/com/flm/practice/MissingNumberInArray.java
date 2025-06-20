package com.flm.practice;

public class MissingNumberInArray {
	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1; // The expected number of elements
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int num : arr) {
			actualSum += num;
		}

		return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5 };
		int missing = findMissingNumber(numbers);
		System.out.println("Missing number is: " + missing); // Output: 3
	}
}
