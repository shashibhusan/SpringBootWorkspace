package javaconcept.oftheday;

public class RatationOfArray {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int numOfPlaceRotated = 3;
		for (int i = 0; i < numOfPlaceRotated; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		for (int k : a) {
			System.out.print(k);
		}
	}

}
