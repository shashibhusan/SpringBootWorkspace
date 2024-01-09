package javaconcept.oftheday;

public class ReverseEachWord {

	public static void main(String[] args) {
		String input = "Java J2EE JSP Servlets Hibernate Struts";
		String s[] = input.split("\\s+");
		String outputString = "";
		for (int i = 0; i < s.length; i++) {
			char ch[] = s[i].toCharArray();
			String reverseWord = "";
			for (int j = ch.length - 1; j >= 0; j--) {
				reverseWord = reverseWord + ch[j];
			}
			outputString = outputString + reverseWord + " ";
		}

		System.out.println("Output : " + outputString);

	}

}
