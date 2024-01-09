package com.reflection.example;

public class Employee {

	private final String employeeName;
	private final String employeeAddress;
	private int employeAge;

	public Employee(String employeeName, String employeeAddress, int employeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeAge = employeAge;
	}

	public int getEmployeAge() {
		return employeAge;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void publicMethod() {
		System.out.println("This is publicMethod()");
	}

	private void privateMethod() {
		System.out.println("This is privateMethod()");
	}

	public static void publicStaticMethod() {
		System.out.println("This is publicStaticMethod()");
	}

	private static void privateStaticMethod() {
		System.out.println("This is privateStaticMethod()");
	}

}
