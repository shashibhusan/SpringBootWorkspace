package program.stack;

import java.util.Stack;

public class SolvingPostFixExpression {

	public static void main(String[] args) {
		String str = "231*+9-";
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				int a = Character.getNumericValue(ch);
				st.push(a);
			} else {
				int value1 = st.pop();
				int value2 = st.pop();

				switch (ch) {
				case '+':
					st.push(value2 + value1);
					break;
				case '-':
					st.push(value2 - value1);
					break;
				case '*':
					st.push(value2 * value1);
					break;
				case '/':
					st.push(value2 / value1);
					break;
				}
			}
		}

		System.out.println(st.pop() + " ");
	}

}
