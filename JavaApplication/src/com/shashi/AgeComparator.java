package com.shashi;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		User s1 = (User) o1;
		User s2 = (User) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}

}
