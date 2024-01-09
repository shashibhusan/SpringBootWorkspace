package com.practice;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		int firstIndex = -1, lastIndex = -1;
		int a[] = { 0, 4, 6, 0, 1, 2, 4, 5, 6, 7, 8, 9, 9, 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 6 && firstIndex >= 0) {
				lastIndex = i;
			} else if (a[i] == 6 && firstIndex == lastIndex) {
				firstIndex = i;
				lastIndex = i;
			}
		}
		System.out.println("First Index " + firstIndex + " Last index " + lastIndex);
	}

}
