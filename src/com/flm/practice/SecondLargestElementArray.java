package com.flm.practice;

public class SecondLargestElementArray {

	public static int findSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		if (arr == null || arr.length < 2) {
			System.out.println("The Interger size should be greater than 2");
		}
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}

		}
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is not distinct second largest element");
			return largest;
		}
		return secondLargest;

	}

	public static void main(String[] args) {
		// System.out.println(Integer.MIN_VALUE);
		int[] numbers = { 10, 11, 10 };
		int secondlargest = findSecondLargest(numbers);
		System.out.println("The Second largest element in the given array is " + secondlargest);
	}

}
