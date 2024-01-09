package java8.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingHashMapUsingJava8 {

	public static void main(String[] args) {
		HashMap<String, Double> hashMap = new HashMap<>();
		hashMap.put("Math", 67.23);
		hashMap.put("Physics", 77.21);
		hashMap.put("Chemistry", 72.78);
		hashMap.put("Social science", 62.98);
		hashMap.put("Biology", 80.11);

		HashMap<Double, String> result = hashMap.entrySet()
				.stream()
				.sorted((m1, m2) -> m1.getValue().compareTo(m2.getValue()))
				.collect(
						Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (e1, e2) -> e1, LinkedHashMap::new));

		for (Map.Entry e1 : result.entrySet()) {
			System.out.println(e1.getKey() + " " + e1.getValue());
		}
	}

}
