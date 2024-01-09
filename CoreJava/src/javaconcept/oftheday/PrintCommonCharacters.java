package javaconcept.oftheday;

import java.util.Set;
import java.util.TreeSet;

public class PrintCommonCharacters {

	public static void main(String[] args) {
		String s1 = "thin sticks";
		String s2 = "thick bricks";

		char ch1[] = s1.replaceFirst("\\s+", "").toCharArray();
		char ch2[] = s2.replaceFirst("\\s+", "").toCharArray();

		Set<Character> set1 = new TreeSet<>();
		for (int i = 0; i < ch1.length; i++) {
			set1.add(ch1[i]);
		}
		Set<Character> set2 = new TreeSet<>();

		for (int i = 0; i < ch2.length; i++) {
			set2.add(ch2[i]);
		}

		set1.retainAll(set2);

		System.out.println("Common character in alphbetical order is " + set1);
	}

}
