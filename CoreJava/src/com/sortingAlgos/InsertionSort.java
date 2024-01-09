package com.sortingAlgos;

/*
 * Worst case time complexity of this Algorithm will be O(n2); 
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 9, 14, 3, 2, 43, 11, 58, 22 };

		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}

		for (int k : a) {
			System.out.print(k + " ");
		}
	}

}
