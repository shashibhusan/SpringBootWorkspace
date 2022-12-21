package com.shashi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String s[]) {

		int a[] = { 1, 2, 3, 3, 4, 4, 2, 6, 7, 8 };

		int b[] = Arrays.stream(a).distinct().toArray();

		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 2, 6, 7, 8);
		List<Integer> resultList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Result :: " + resultList);
	}

}
