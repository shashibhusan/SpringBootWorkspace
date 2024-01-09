package com.shashi;

public class LogicalProgramOne {

	public static void main(String[] args) {
		String name = "shashibhusanpatel";
		int start = 0;
		char end = 5;
		String subString = name.substring(start, end);
		System.out.println("SubString is " + subString);

		String str = null;
		String str1 = "abc";

		System.out.println(str1.equals("abc") | str.equals(null));

	}

}
