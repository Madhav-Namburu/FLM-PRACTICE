package com.flm.practice;

public class LinearSearch {
	public static int linearSearch(int[] arr, int target) {
		// Iterate through each element of the array
		for (int i = 0; i < arr.length; i++) {
			// Check if the current element is equal to the target
			if (arr[i] == target) {
				// If found, return the index of the element
				return i;
			}
		}
		// If the target is not found after checking all elements, return -1
		return -1;
	}

	public static void main(String[] args) {
	        int[] numbers = {10, 5, 8, 2, 15, 7};
	        int searchElement = 8;
	        int index = linearSearch(numbers, searchElement);

	        if (index != -1) {
	            System.out.println("Element " + searchElement + " found at index: " + index);
	        } else {
	            System.out.println("Element " + searchElement + " not found in the array.");
	        }
	}
}
