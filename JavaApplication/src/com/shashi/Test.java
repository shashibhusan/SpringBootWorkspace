package com.shashi;

public class Test {
	
	public static void main(String[] args) {
		int a = 12;
		Employee e1 = new Employee(null, null, "test", null);
		System.out.println("Employee address : " + e1.getAddress());
		change(e1, a);
		System.out.println("New employee address is : " + e1.getAddress());
		System.out.println("New value of a is : " + a);
	}

	public static void change(Employee e, int a) {
		e.setAddress("Noida Ballia piluee");
		a = a + 1;
	}
}


