package javaconcept.oftheday;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapByKeys {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(9, 12);
		map.put(11, 12);
		map.put(4, 34);
		map.put(-6, 23);
		map.put(0, 11);
		map.put(3, 10);
		map.put(-1, 1);
		map.put(3, 12);

		// Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(map);
		// System.out.println("" + treeMap);

		// Map<Integer, Integer> treeMap = new TreeMap<Integer,
		// Integer>(Collections.reverseOrder());
		// treeMap.putAll(map);
		// System.out.println("" + treeMap);

		// Using java 8
		Map<Integer, Integer> treeMap = map.entrySet().stream().sorted(Collections.reverseOrder(Entry
				.comparingByKey()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a1, a2) -> a2, LinkedHashMap::new));
		System.out.println("" + treeMap);
	}

}
