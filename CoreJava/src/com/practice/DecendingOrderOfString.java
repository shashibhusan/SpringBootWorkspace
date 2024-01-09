package com.practice;

import java.util.Scanner;

public class DecendingOrderOfString {

	public static void main(String[] args) {
		System.out.println("Please enter the String");
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		char[] charArrya = input.toCharArray();
		for (int i = 0; i < charArrya.length; i++) {
			for (int j = i + 1; j < charArrya.length; j++) {
				if (Character.toLowerCase(charArrya[j]) > Character.toLowerCase(charArrya[i])) {
					char temp = charArrya[i];
					charArrya[i] = charArrya[j];
					charArrya[j] = temp;
				}
			}
		}
		System.out.println("Decending order of string is : ");
		System.out.println(String.valueOf(charArrya));
	}

}
