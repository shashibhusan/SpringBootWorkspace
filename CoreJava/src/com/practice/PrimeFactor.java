package com.practice;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		System.out.println("Please enter the number");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		while (input % 2 == 0) {
			System.out.print(" " + 2);
			input=input/2;
		}
		for (int i = 3; i < Math.sqrt(input); i=i+2) {
			while (input % i == 0) {
				System.out.print(" " + i);
				input = input / i;
			}
		}
		if (input > 2) {
			System.out.print(" " + input);
		}
	}

}
