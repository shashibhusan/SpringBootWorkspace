package com.shashi;

public class TestClass {
	
	public void TestMethod1() {
		String abc=TestMethod();
		System.out.println("Return values : "+abc);
	}

	public String TestMethod() {
		try {
			int a = 12;
			if (a > 100) {

			} else {
				int b=1/0;
			}
			return "success";
		} catch (Exception ex) {
			System.out.println("" + ex.getMessage());
			throw new RuntimeException("testing");
		}
	}
	
	public static void main(String[] args) {
		new TestClass().TestMethod1();
	}
}
