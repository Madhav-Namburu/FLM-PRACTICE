package com.flm.practice;

public class occuranceofstrings {

	public static void main(String[] args) {

		String str = "Tomato";

		int charcounts[] = new int[26];

		for (int i = 0; i <str.length(); i++) {
			str=str.toLowerCase();
			char c = str.charAt(i);
			charcounts[c - 'a']++;
		}
		for(int i=0;i<26;i++) {
			if (charcounts[i] > 0) {
				System.out.println("occurance of alphabet  " + (char) (i + 'a') +" is coming " +charcounts[i] +" times");
			}
			}
		}

	}


