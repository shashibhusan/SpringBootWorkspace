package com.shashi;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isWhitespace(input.charAt(i))) {
				out.append(input.charAt(i));
			}
		}
		System.out.println("Output string is : " + out.toString());
	}

}
