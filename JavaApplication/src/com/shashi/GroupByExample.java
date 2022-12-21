package com.shashi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String[] args) {

		List<Company> companyList = new ArrayList<>();
		companyList.add(new Company("HCL", "Noida"));
		companyList.add(new Company("HCL", "Delhi"));
		companyList.add(new Company("HCL", "Gurgaon"));
		companyList.add(new Company("TCS", "Lucknow"));
		companyList.add(new Company("TCS", "Delhi"));
		companyList.add(new Company("TCS", "Gurgaon"));
		
		Map<String, List<String>> result = companyList.stream().collect(
				Collectors.groupingBy(a -> a.getName(), Collectors.mapping(a -> a.getAddress(), Collectors.toList())));
		// System.out.println("result :: " + result);

		Map<String, Integer> citiesWithCodes = new HashMap<String, Integer>();
		citiesWithCodes.put("Berlin", 49);
		citiesWithCodes.put("Frankfurt", 49);
		citiesWithCodes.put("Hamburg", 49);
		citiesWithCodes.put("Cologne", 49);
		citiesWithCodes.put("Salzburg", 43);
		citiesWithCodes.put("Vienna", 43);
		citiesWithCodes.put("Zurich", 41);
		citiesWithCodes.put("Bern", 41);
		citiesWithCodes.put("Interlaken", 41);
		Map<Integer, List<String>> result1 = citiesWithCodes.entrySet().stream().collect(
				Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		// System.out.println("result1 :: " + result1);
		
		for (Map.Entry<String, Integer> entry : citiesWithCodes.entrySet()) {

			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
