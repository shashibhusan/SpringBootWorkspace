package com.shashi;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Please enter the String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		StringBuilder out = new StringBuilder();
		char[] ch = input.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			out.append(ch[i]);
		}
		System.out.println("Reverse Stirng is : " + out);

	}

}
