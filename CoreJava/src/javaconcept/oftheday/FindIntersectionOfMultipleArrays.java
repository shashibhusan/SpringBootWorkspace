package javaconcept.oftheday;

import java.util.Arrays;
import java.util.HashSet;

public class FindIntersectionOfMultipleArrays {

	public static void main(String[] args) {
		Integer a[] = new Integer[] { 2, 3, 4, 7, 1 };
		Integer b[] = new Integer[] { 4, 1, 3, 5 };
		Integer c[] = new Integer[] { 8, 4, 6, 2, 1 };
		Integer d[] = new Integer[] { 7, 9, 4, 1 };
		HashSet<Integer> setA = new HashSet<>(Arrays.asList(a));
		HashSet setB = new HashSet<>(Arrays.asList(b));
		HashSet setC = new HashSet<>(Arrays.asList(c));
		HashSet setD = new HashSet<>(Arrays.asList(d));
		setA.retainAll(setB);
		setA.retainAll(setC);
		setA.retainAll(setD);
		System.out.println("Intersection of all the above is : " + setA);
	}

}
