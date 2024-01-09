package com.practice;

public class PairsOfElements {

	public static void main(String[] args) {
		int input[] = new int[] { 4, 6, 5, -10, 8, 5, 20 };
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == 10) {
					System.out.println(input[i] + " + " + input[j] + " = " + (input[i] + input[j]));
				}
			}
		}
	}

}
