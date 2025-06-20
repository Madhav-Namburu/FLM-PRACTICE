package com.flm.practice;

public class VowelsandConsonants {

	public static void main(String[] args) {
		
		String str="Madhav";
		char[] chars =str.toLowerCase().toCharArray();
        int ca=0;
        int cc=0;
		for (int i =0;i<chars.length;i++) {
			if(chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u'){
				ca++;
			}
			else {
				cc++;
			}
			
		}
		System.out.println("The number of vowels are "+ca);
		System.out.println("The number of consonants are "+cc);
		
	}

}
