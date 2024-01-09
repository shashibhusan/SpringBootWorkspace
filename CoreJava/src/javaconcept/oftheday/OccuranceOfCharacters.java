package javaconcept.oftheday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceOfCharacters {

	public static void main(String[] args) {
		String input = "12233344445555566dddddddd";
		char ch[] = input.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (hashMap.get(ch[i]) == null) {
				hashMap.put(ch[i], 1);
			} else {
				hashMap.put(ch[i], hashMap.get(ch[i]) + 1);
			}
		}
		int max = 0;
		char maxChar = 0;
		Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();
		for (Map.Entry<Character, Integer> en : entrySet) {
			if (en.getValue() > max) {
				max = en.getValue();
				maxChar = en.getKey();
			}
		}
		System.out.println(maxChar + " : " + max);
	}

}
