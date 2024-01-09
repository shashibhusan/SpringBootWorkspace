package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SumPairExample {

	public static void main(String[] args) {
		int a[] = { 2, 4, 7, 5, 9, 10, 4, 7, 10 };
		int targetSum = 14;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 14) {
					hashMap.put(a[i], a[j]);
				}
			}
		}
		System.out.println(" Unique pair are :");
		Iterator iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) iterator.next();
			System.out.println("  " + entry.getKey() + "   " + entry.getValue());
		}
	}

}
