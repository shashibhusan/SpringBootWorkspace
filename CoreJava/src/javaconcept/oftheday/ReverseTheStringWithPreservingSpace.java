package javaconcept.oftheday;

public class ReverseTheStringWithPreservingSpace {

	public static void main(String[] args) {
		String input = "My name is shashi bhusan patel";
		char res[] = new char[input.length()];
		char ch[] = input.replaceAll("\\s+", "").toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				res[i] = ' ';
			}
		}

		int k = 0;
		for (int j = ch.length - 1; j >= 0; j--) {
			char c = res[k];
			char c1 = ch[j];
			if (c != ' ') {
				res[k] = c1;
			} else {
				k++;
				res[k] = c1;
			}
			k++;

		}

		for (char c : res) {
			System.out.print(c);
		}

		}
	}

