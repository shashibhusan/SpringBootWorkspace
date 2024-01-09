package com.shashi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String originalString, reverseString = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Please number or String");
		originalString = in.nextLine();
		for (int i = originalString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + originalString.charAt(i);
		}
		System.out.println("Reverse String is : " + reverseString);
		if (originalString.equals(reverseString)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}

}
