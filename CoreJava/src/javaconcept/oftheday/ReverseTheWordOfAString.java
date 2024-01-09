package javaconcept.oftheday;

public class ReverseTheWordOfAString {

	public static void main(String[] args) {
		String st = "Java Concept Of The Day";
		String s[] = st.split("\\s+");
		String outputString = "";
		for (int i = s.length - 1; i >= 0; i--) {
			outputString = outputString + s[i] + " ";
		}
		System.out.println(outputString);
	}

}
