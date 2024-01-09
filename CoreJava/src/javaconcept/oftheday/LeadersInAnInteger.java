package javaconcept.oftheday;

public class LeadersInAnInteger {

	public static void main(String[] args) {
		int a[] = new int[] { 8, 23, 19, 21, 15, 6, 11 };
		int l = a.length;
		System.out.println("Leader Integer elements are ");
		System.out.println(a[l - 1]);
		int max = a[l - 1];
		for (int i = l - 2; i >= 0; i--) {
			if (a[i] > max) {
				System.out.println(a[i]);
				max = a[i];
			}
		}
	}

}
