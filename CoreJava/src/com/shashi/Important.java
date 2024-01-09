package com.shashi;

public class Important {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1.concat(s2);
		String s4 = "helloworld";
		System.out.println("-------1--------");
		System.out.println(s3 == s4); // False

		String a[] = { "aa", "bb", "cc" };
		String b = "bb";
		System.out.println("-------2--------");
		System.out.println(a[1] == b); // True
		System.out.println("-------3--------");
		System.out.println(1.0 / 0.0); // Infinity
		System.out.println("-------4--------");
		System.out.println(0.2 == 0.1 * 2); // True
		System.out.println(0.3 == 0.1 * 3); // False
		// (If floating value is not divisible by 2 the it will be not round off )
		System.out.println("-------5--------");
		Integer n1 = 200, n2 = 200;
		System.out.println(n1 == n2);
		Integer n3 = 10, n4 = 10;
		System.out.println(n3 == n4);

		/*
		 * It is because the Integer class has the inner class that is private and is
		 * known as IntegerCache class. The IntegerCache class does the caching of
		 * Integer objects that are within the range -128 to 127. Therefore, when we
		 * define Integer n3 = 10, it internally gets converted to
		 * Integer n3 = Integer.valueOf(10).
		 */



	}

}
