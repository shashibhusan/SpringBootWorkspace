package com.practice;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		int max_count = 0;
		char max_char = Character.MIN_VALUE;
		System.out.println("Please enter the string");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a[] = new int[256];
		for (int i = 0; i < input.length(); i++) {
			a[input.charAt(i)]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max_count) {
				max_count = a[i];
				max_char = (char) i;
			}
		}
		System.out.println(" character & counts are : " + max_char + "  " + max_count);
	}

}
