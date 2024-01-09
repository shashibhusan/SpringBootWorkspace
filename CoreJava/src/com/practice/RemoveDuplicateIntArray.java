package com.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateIntArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 8, 44, 6, 98 };
		int b[] = Arrays.stream(a).distinct().toArray();
		for (int i : b) {
			// System.out.print(i);
		}

		Set<Integer> intset = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			intset.add(a[i]);
		}
		Arrays.sort(a);
		int k = extracted(a, a.length);
		for (int i = 0; i < k; i++) {
			System.out.print(a[i] + " ");
		}

	}

	private static int extracted(int[] a, int n) {
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n - 1];
		return j;
	}

}
