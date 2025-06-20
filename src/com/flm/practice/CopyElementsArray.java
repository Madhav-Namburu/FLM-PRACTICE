package com.flm.practice;

import java.util.Arrays;

public class CopyElementsArray {

	public static void main(String[] args) {
		int[] sourceArray = {10, 20, 30, 40, 50};
        int[] destinationArray = new int[sourceArray.length];

        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

        // Verify the copy
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Destination Array: " + Arrays.toString(destinationArray));

        
        //int[] partialCopy = Arrays.copyOf(sourceArray, 2); // Copies the first 2 elements
        //System.out.println("Partial Copy: " + Arrays.toString(partialCopy));
        
        //int[] destinationArray = Arrays.copyOfRange(sourceArray, 1, 4); // Copies elements from index 1 (inclusive) to 4 (exclusive)
        // System.out.println("Source Array: " + Arrays.toString(sourceArray));
	}

}
