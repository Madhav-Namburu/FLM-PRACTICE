package com.flm.practice;

import java.util.Arrays;

public class InsertElemntArray {

	public static void main(String[] args) {
		int[] originalArray = { 10, 20, 40, 50 };
		int elementToInsert = 30;
		int insertIndex = 3;
		int[] newArray = new int[originalArray.length + 1];

		// Copy elements before the insertion point
		System.arraycopy(originalArray, 0, newArray, 0, insertIndex);

		// Insert the new element
		newArray[insertIndex] = elementToInsert;

		// Copy elements after the insertion point
		System.arraycopy(originalArray, insertIndex, newArray, insertIndex + 1, originalArray.length - insertIndex);

		System.out.println("Original array: " + Arrays.toString(originalArray));
		System.out.println("New array with inserted element: " + Arrays.toString(newArray));
		// Output:
		// Original array: [10, 20, 40, 50]
		// New array with inserted element: [10, 20, 30, 40, 50]
	}

}
