package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("shashi");
		arrayList.add("bhusan");
		arrayList.add("patel");
		List<String> resultListOfMap = arrayList.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
		System.out.println("Example of map() in java 8");
		for (String st : resultListOfMap) {
			System.out.print("" + st);
		}
		System.out.println("\nExample of flatMap() in java 8");
		ArrayList<List<Integer>> intList = new ArrayList<List<Integer>>();
		intList.add(Arrays.asList(1, 2, 3));
		intList.add(Arrays.asList(1, 2, 3));
		intList.add(Arrays.asList(1, 2, 3));
		List<Integer> resultListOfFlatMap = intList.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
		for (Integer inte : resultListOfFlatMap) {
			System.out.print("" + inte);
		}
	}

}
