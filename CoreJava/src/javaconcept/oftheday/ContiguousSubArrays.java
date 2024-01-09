package javaconcept.oftheday;

import java.util.ArrayList;

public class ContiguousSubArrays {

	public static void main(String[] args) {
		int sumCount = 8;
		int count = 0;
		int a[] = new int[] { 2, 4, 2, 8, 3, 3, 2, -4, 12 };
		ArrayList list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			count = count + a[i];
			list.add(a[i]);
			if (count == sumCount) {
				int subArray[] = new int[list.size()];
				for (int j = 0; j < list.size(); j++) {
					subArray[j] = (int) list.get(j);
				}
				for (int b : subArray) {
					System.out.print(b + " ");
				}
				System.out.println("");
				list.clear();
				count = 0;
			}
		}
	}

}
