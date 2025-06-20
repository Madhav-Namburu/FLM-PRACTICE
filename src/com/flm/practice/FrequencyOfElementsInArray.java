package com.flm.practice;

import java.util.Arrays;

public class FrequencyOfElementsInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,1,2,34,5,6};
		Arrays.sort(arr); // First sort the array

        int currentElement = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] ==currentElement) {
                count++;
            } else {
                System.out.println("Element " + currentElement + " occurs " + count + " times.");
                currentElement = arr[i];
                count = 1;
            }
        }

        // Print the frequency of the last element
        System.out.println("Element " + currentElement + " occurs " + count + " times.");
    }
	}


