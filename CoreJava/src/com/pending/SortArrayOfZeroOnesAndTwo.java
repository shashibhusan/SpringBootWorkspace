package com.pending;

/*
 * Time complexity of this algorithm will be O(n) in worst case.
 */
public class SortArrayOfZeroOnesAndTwo {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 0, 1, 2, 1, 1, 1, 1, 0, 0, 0, 0, 2, 2, 2, 2, 2 };
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zeroCount = zeroCount + 1;
			} else if (a[i] == 1) {
				oneCount = oneCount + 1;
			} else if (a[i] == 2) {
				twoCount = twoCount + 1;
			}
		}
		int result[] = new int[a.length];

		for (int i = 0; i < zeroCount; i++) {
			result[i] = 0;
		}
		for (int i = zeroCount; i < (zeroCount + oneCount); i++) {
			result[i] = 1;
		}
		for (int i = (zeroCount + oneCount); i < a.length; i++) {
			result[i] = 2;
		}

		for (int b : result) {
			System.out.print(b);
		}

	}

}
