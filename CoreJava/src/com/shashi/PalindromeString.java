package com.shashi;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		boolean isPalindrome = true;
		scanner.close();
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}

}
