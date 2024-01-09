package com.practice;

public class RemovingElement {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 6) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				break;
			}
		}
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
