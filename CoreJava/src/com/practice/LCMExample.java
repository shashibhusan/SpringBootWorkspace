package com.practice;

import java.util.Scanner;

public class LCMExample {

	public static void main(String[] args) {
		System.out.println("Please enter the first number");
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		scanner.close();
		int max = n1 > n2 ? n1 : n2;
		while (true) {
			if (max % n1 == 0 && max % n2 == 0) {
				System.out.println("" + max);
				break;
			}
			++max;
		}
	}
}
