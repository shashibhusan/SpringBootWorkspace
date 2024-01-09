
package javaconcept.oftheday;

public class PrintAllPossibleSubstrings {

	public static void main(String[] args) {
		String input = "Java";
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				System.out.println(input.substring(i, j));
			}
		}
	}

}
