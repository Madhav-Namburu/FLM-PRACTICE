package com.flm.practice;

public class FibonacciRecursion {

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = 10; // You can change this value to find a different Fibonacci number
		System.out.println("The " + n + "-th Fibonacci number is: " + fibonacci(n));
	}

}
