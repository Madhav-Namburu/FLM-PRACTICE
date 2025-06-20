package com.flm.practice;

public class LargestNumberIndexFinder {
	public static int findIndexOfLargest(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Input array cannot be null or empty.");
		}

		int largestIndex = 0;
		int largestNumber = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largestNumber) {
				largestNumber = arr[i];
				largestIndex = i;
			}
		}

		return largestIndex;
	}

	public static void main(String[] args) {
		int[] numbers1 = { 5, 2, 9, 1, 5, 6 };
		int largestIndex1 = findIndexOfLargest(numbers1);
		System.out.println(
				"Index of the largest number in " + java.util.Arrays.toString(numbers1) + ": " + largestIndex1); // Output:
																													// 2
	}
}
