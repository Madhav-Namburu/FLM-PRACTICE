package com.flm.practice;

public class ABC {

	public static void main(String[] args) {
		String string = "Welcome to Java Programming and Dotnet Programming";
		 String[] wordsCount = string.split(" ");

		 System.out.println("The Given String is:\n" + string + "\n");
		

		 for(int i = wordsCount.length;i > 0;i--)
		 {
		 System.out.print(wordsCount[i - 1] + " ");
		 }


	}

}
