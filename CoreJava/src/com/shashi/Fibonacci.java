package com.shashi;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a, b = 0, c = 1;
		System.out.println("Please enter the length of Fabonacci series");
		Scanner scanner=new Scanner(System.in);
		int l = scanner.nextInt();
		for (int i = 0; i < l; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}

	}

}
