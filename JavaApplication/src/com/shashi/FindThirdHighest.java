package com.shashi;

import java.util.Arrays;

public class FindThirdHighest {

	public static void main(String[] args) {
		String a[] = { "shashi", "bhusan", "patel", "chandra", "bhusan", "patel" };

		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			// System.out.println(" :: " + Arrays.asList(a).indexOf(a[i]));
			if (Arrays.asList(a).indexOf(a[i]) != Arrays.asList(a).lastIndexOf(a[i])) {
				System.out.println(a[i]);
			}
		}

	}

}
