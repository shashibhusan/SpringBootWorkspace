package com.shashi;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VowelPresent {

	public static void main(String[] args) {
		System.out.println("Enter the input String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		// boolean isPresent = input.toLowerCase().matches(".*[aeiou].*");
		boolean isPresent = Pattern.matches(".*[aeiou]", input.toLowerCase());
		if (isPresent) {
			System.out.println("Vowel is present in input string");
		} else {
			System.out.println("Vowel is not present in input string");
		}
	}

}
