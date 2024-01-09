package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		ArrayList<Character> alist = new ArrayList<Character>(
				Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		int vowel = 0, consonant = 0;
		System.out.println("Please enter the String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (alist.contains(input.charAt(i))) {
				vowel++;
			} else if ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
					|| input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				consonant++;
			}
		}
		System.out.println("Number of vowel & consonants are : " + vowel + " " + consonant);
	}

}
