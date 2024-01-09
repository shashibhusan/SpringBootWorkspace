package javaconcept.oftheday;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortByFrequency {

	public static void main(String[] args) {
		int a[] = new int[] { 7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) == null) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}

		HashMap<Integer, Integer> sortedMap = map.entrySet().stream().sorted(
				Entry
				.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sortedMap);
		Set<Map.Entry<Integer, Integer>> set = sortedMap.entrySet();
		for (Map.Entry<Integer, Integer> e : set) {
			int i = e.getKey();
			int j = e.getValue();
			for (int k = 0; k < j; k++) {
				System.out.print(i);
			}
		}
	}

}
