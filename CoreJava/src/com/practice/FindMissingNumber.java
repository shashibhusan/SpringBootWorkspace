package com.practice;

public class FindMissingNumber {

	public static void main(String[] args) {
		int a1[] = { 1, 2, 3, 4, 5, 0, 7, 8, 9 };
		int a2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		for (int i = 0; i < a1.length; i++) {
			sum = sum + a2[i] - a1[i];
		}
		System.out.println("Missing element is " + sum);
	}

}
