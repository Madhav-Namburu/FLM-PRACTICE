package com.flm.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the first String");
	  String str1=sc.nextLine().toLowerCase();
	  System.out.pintln("Enter the second String");
	  String str2=sc.nextLine().toLowerCase();
	  
	  char[] c1=str1.toCharArray();
	  char[] c2=str2.toCharArray();
	  Arrays.sort(c1);
	  Arrays.sort(c2);
	  
	  if(Arrays.equals(c1, c2)) {
		  System.out.println("The given strings are Anagrams");
	  }
	  else {
		  System.out.println("The given strings are not Anagrams");
	  }
	  
	  
	}

}
