package com.shashi;

public class ExceptionExample02 {

	public static void main(String s[]) {
		try {
			testMethod();
		} catch (RuntimeException e) {
			throw new ExceptionExample01("Exception in calculation", e);
		}
	}

	public static int testMethod() {
		int c = 12;
		return c / 0;
	}

}
