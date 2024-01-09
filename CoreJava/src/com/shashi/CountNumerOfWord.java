package com.shashi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumerOfWord {

	public static void main(String[] args) {
		System.out.println("Enter the sentence");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		String[] stringArray = input.split(" ");
		for (int i = 0; i < stringArray.length; i++) {
			String key = stringArray[i];
			if (hashMap.containsKey(key)) {
				int value = hashMap.get(key);
				hashMap.put(key, value + 1);
			} else {
				hashMap.put(key, 1);
			}
		}
		for (Map.Entry me : hashMap.entrySet()) {
			System.out.println(" " + me.getKey() + "  " + me.getValue());
		}
	}

}
