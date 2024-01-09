package javaconcept.oftheday;

import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		String input = "thelongestsubstring";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		String longestSubstring = null;
		int maxLength = 0;
		char ch[] = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char ct = ch[i];
			if (map.containsKey(ct)) {
				i = map.get(ct);
				map.clear();
			} else {
				map.put(ct, i);
			}
			if (map.size() > maxLength) {
				maxLength = map.size();
				longestSubstring = map.keySet().toString();
			}

		}
		System.out.println("Output : " + longestSubstring);
	}

}
