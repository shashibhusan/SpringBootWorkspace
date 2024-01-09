package com.serching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int result = new BinarySearch().search(arr, 3);
		if (result >= 0) {
			System.out.println("Element is present");
		} else {
			System.out.println("Element is not present");
		}
	}

	private int search(int input[], int key) {
		int s = 0;
		int l = input.length - 1;
		while (s <= l) {
			int m = s + (l - s) / 2;
			if (key == input[m]) {
				return m;
			}
			if (key > input[m]) {
				s = m + 1;
			} else {
				l = m - 1;
			}
		}
		return -1;
	}

}
