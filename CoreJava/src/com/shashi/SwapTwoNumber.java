package com.shashi;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 5, b = 6;
		System.out.println("Value before swap : a=" + a + " b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value before swap : a=" + a + " b=" + b);
	}

}
