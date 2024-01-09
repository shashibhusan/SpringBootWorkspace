package javaconcept.oftheday;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int a[] = new int[] { -7, 12, 17, 29, 41, 56, 79 };
		int b[] = new int[] { -9, -3, 0, 5, 19 };
		int res[] = new int[a.length + b.length];
		int k = 0;
		int i=0;
		int j=0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				k++;
				i++;
			} else {
				res[k] = b[j];
				k++;
				j++;
			}
		}
		while (i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}
		for (int m : res) {
			System.out.print(m + " ");
		}

	}

}
