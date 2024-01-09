package com.shashi;

/* Time Complexity: O(n)
 * 
 * Auxiliary Space: O(n)
 * But if implement with for loop the Auxiliary space complexity will be 
 * O(1)
 */
import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		System.out.println("Factorials of the number is : " + calculateFact(input));
		System.out.println("Factorials of the number is : " + getFactorials(input));
	}

	public static long calculateFact(long n) {
		if (n == 1) {
			return 1;
		} else {
			return n * calculateFact(n - 1);

		}
	}

	public static int getFactorials(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

}
