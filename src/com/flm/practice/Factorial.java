package com.flm.practice;

import java.util.Scanner;

public class Factorial {
	
	public static int Factorial(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Number to get factorial :");
		int n=Sc.nextInt();
		System.out.println("The factorial of "+n + " is " +Factorial(n));

	}

}
