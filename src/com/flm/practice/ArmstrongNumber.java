package com.flm.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {
        if (num < 0) return false;
        if (num == 0) return true;

        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            sum += Math.pow(num % 10, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println(n + (isArmstrong(n) ? " is" : " is not") + " an Armstrong number.");
        scanner.close();
    }
}

