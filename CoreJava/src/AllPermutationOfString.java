
/*
 * Time Complexity: O(N2), where N is the length of the given string
 * Because it executing for N and then calling itself of N times
 * 
 * Auxiliary Space: O(N) 
 * It will take some space for processing for calling itself
 */

public class AllPermutationOfString {
	static void printPermutn(String str, String ans) {
	
		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
	
			// ith character of str
			char ch = str.charAt(i);
	
			// Rest of the string after excluding the ith character
			String r = str.substring(0, i) + str.substring(i + 1);
			// System.out.println("r " + r);
			// Recurvise call
			printPermutn(r, ans + ch);
		}
	}

	// Driver code
	public static void main(String[] args) {
		String s = "abcc";
		printPermutn(s, "");
	}
}

