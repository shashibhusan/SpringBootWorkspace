package com.shashi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElements {

	public static void main(String[] args) {
		Integer[] a1 = { 1, 2, 3, 4, 1, 2 };
		Integer[] a2 = { 1, 2, 3, 4, 5 };
		if (isSameArray(a1, a2)) {
			System.out.println("Both array contains same elements");
		} else {
			System.out.println("Both array contains do not same elements");
		}
	}

	public static boolean isSameArray(Integer[] a1, Integer[] a2) {
		Set<Object> uniqueSet1 = new HashSet<>(Arrays.asList(a1));
		Set<Object> uniqueSet2 = new HashSet<>(Arrays.asList(a2));
		if (uniqueSet1.size() != uniqueSet2.size()) {
		return false;
		}
		for(Object ob : uniqueSet1) {
			if (!uniqueSet2.contains(ob)) {
				return false;
			}
		}
		return true;
	}

}
