package com.pending;

public class FirstKnonRepeatingCharacters {

	public static void main(String[] args) {
		String input = "YYXBYX";
		int k = 2;
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (input.indexOf(c) == input.lastIndexOf(c)) {
				System.out.print(c);
				count++;
				if (count > k) {
					break;
				}
			}
		}
	}

}
