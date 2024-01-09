package javaconcept.oftheday;

public class FindAllPermutations {

	public static void print(String input) {
		printAll("", input);
	}

	public static void printAll(String permutation, String input) {
		if (input.length() == 0) {
			System.out.println(permutation);
		} else {
			for (int i = 0; i < input.length(); i++) {
				printAll(permutation + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, input.length()));
			}
		}
	}

	public static void main(String[] args) {
		print("abc");
	}

}
