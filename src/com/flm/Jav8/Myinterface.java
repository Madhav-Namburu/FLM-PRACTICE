package com.flm.Jav8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Myinterface {

	public static void main(String[] args) {

		int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Create a new array by streaming indices in reverse order
        int[] reversedNumbers = IntStream.rangeClosed(1, numbers.length) // Generates numbers 1 to length
                                         .map(i -> numbers.length - i)  // Maps to reverse indices (length-1 down to 0)
                                         .map(i -> numbers[i])          // Maps indices to actual array elements
                                         .toArray();   
System.out.println(Arrays.toString(reversedNumbers));
        
	}
}
