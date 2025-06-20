package com.flm.practice;

import java.util.Arrays;

public class MergeArraysArray {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int[] mergedArray = new int[array1.length + array2.length];

		// Copy elements from array1
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);

		// Copy elements from array2, starting after the elements of array1
		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

}
