package com.practice;

import java.util.Arrays;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int c[] = new int[] { 1, 2, 3, 4, 5, 9, 9, 6, 1, 2, 3, 4, 5, 6, 7, 6, 9, 1, 0 };
		int res[] = new int[c.length];
		int k = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[j] == c[i]) {
					res[k] = c[i];
					k++;
					break;
				}
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.print(res[i]);
		}
		System.out.println("");

		int d[] = new int[] { 1, 2, 3, 4, 5, 9, 9, 6, 1, 2, 3, 4, 5, 6, 7, 6, 9, 1, 0 };
		Arrays.sort(d);
		int l = 0;
		int s[] = new int[d.length];
		for (int i = 0; i < d.length - 1; i++) {
			if (d[i] == d[i + 1]) {
				s[l] = d[i];
				l++;
			}
		}

		for (int i = 0; i < l; i++) {
			System.out.print(s[i]);
		}
	}

}
