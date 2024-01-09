package com.shashi;

public class SecondHighest {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 4, 1, 2 };
		int highestInt = Integer.MIN_VALUE;
		int secondHighestInt = Integer.MIN_VALUE;
		for (int i : a) {
			if (i > highestInt) {
				secondHighestInt = highestInt;
				highestInt = i;
			} else if (i > secondHighestInt) {
				secondHighestInt = i;
			}
		}
		System.out.println("Highest & SecondHighest elements are : " + highestInt + " & " + secondHighestInt);
	}

}
