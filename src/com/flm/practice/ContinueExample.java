package com.flm.practice;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// If the current number is even, skip to the next iteration
			if (i % 2 == 0) {
				System.out.println("Skipping even number: " + i);
				continue;//  This statement skips the rest of the current iteration
			}

			// This code will only be executed for odd numbers
			System.out.println("Processing odd number: " + i);
		}

		System.out.println("\nExample with while loop:");
		int j = 0;
		while (j < 5) {
			j++;
			if (j == 3) {
				System.out.println("Skipping number 3");
				continue;
			}
			System.out.println("Current number in while loop: " + j);
		}
	}

}
