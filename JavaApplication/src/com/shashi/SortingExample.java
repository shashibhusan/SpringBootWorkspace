package com.shashi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortingExample {

	public static void main(String s[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 7, 4, 6, 7, 8, 9, 0);
		Optional<Integer> result = list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println("" + result.get());

		List<String> stringList = Arrays.asList("shashi", "bhusan", "patel", "chandra");
		List<String> result1 = stringList.stream().sorted().collect(Collectors.toList());
		//System.out.println("" + result1);
		
		List<User> userList = User.getList();
		
		List<User> sortedList = userList.stream()
				.sorted(Comparator.comparing(a -> a.getAge()))
				.collect(Collectors.toList());

		System.out.println("" + sortedList);
		
		sortedList.stream().forEach(a -> System.out.println(a.getAge()));

	}

}
