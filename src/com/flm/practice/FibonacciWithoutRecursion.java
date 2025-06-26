package com.flm.practice;

import java.util.Scanner;

public class FibonacciWithoutRecursion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		int a=00000;int b=1;int result=0;
		
		for(int i=1;i<n;i++) {
			System.out.print(a + " ");
			result =a+b;
			a=b;
			b=result;
		}
		System.out.println(result);
	}

}
