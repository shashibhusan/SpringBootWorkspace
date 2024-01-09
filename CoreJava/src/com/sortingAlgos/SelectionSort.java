package com.sortingAlgos;

/*
 * Worst case time complexity of this Algorithm will be O(n2); 
 */
public class SelectionSort {

	public static void main(String[] args) {

		int[] a = { 9, 14, 3, 2, 43, 11, 58, 22 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int k : a) {
			System.out.print(k + " ");
		}
	}

}
