package com.practice;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int c[] = new int[] { 1, 2, 3, 4, 5, 9, 9, 6, 1, 2, 3, 4, 5, 6, 7, 6, 9, 1, 0, 8 };
		int res[] = new int[c.length];
		int k = 0;
		boolean temp;
		for (int i = 0; i < c.length; i++) {
			temp = true;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					temp = false;
					break;
				}
			}
			if (temp) {
				res[k] = c[i];
				k++;
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.print(res[i]);
		}

		System.out.println("");
		int d[] = new int[] { 1, 2, 3, 4, 5, 9, 9, 6, 1, 2, 3, 4, 5, 6, 7, 6, 9, 1, 0, 8 };
		Arrays.sort(d);
		int l = 0;
		int re[] = new int[d.length];
		for (int i = 0; i < d.length - 1; i++) {
			if ((d[i] != d[i + 1])) {
				re[l] = d[i];
				l++;
			}
		}
		re[l] = d[d.length - 1];
		for (int i = 0; i <= l; i++) {
			System.out.print(re[i]);
		}
	}

}
