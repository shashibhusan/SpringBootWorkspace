package com.practice;

public class BinaryCheck {

	public static void main(String[] args) {
		int input = 10110101;
		boolean flag = true;
		while (input != 0) {
			int temp = input % 10;
			input = input / 10;
			if (temp > 1) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("It is a binary number");
		} else {
			System.out.println("It is not a binary number");
		}
	}

}
