package com.practice;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		int a = 12, b = 34, c = 10;
		System.out.println("Please the base");
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		System.out.println("Please the exponent");
		int exponent = scanner.nextInt();
		scanner.close();
		int result=1;
		while (exponent!=0) {
			result=result*base;
			--exponent;
		}
		System.out.println("Result will be will : " + result);
	}
}
