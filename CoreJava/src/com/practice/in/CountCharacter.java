package com.practice.in;

public class CountCharacter {

	public static void main(String[] args) {
		String s = "Hi this is Marry";
		char ch[] = s.replaceAll("\\s", "").toCharArray();
		int max_count = 0;
		char max_char = Character.MIN_VALUE;
		int a[] = new int[255];
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			a[c]++;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max_count) {
				max_count = a[i];
				max_char = (char) i;
			}
		}
		System.out.println(" " + max_char + " " + max_count + " Times");

	}

}
