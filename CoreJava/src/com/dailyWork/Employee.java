package com.dailyWork;

public class Employee {

	private String firstName;
	private String lastName;
	private int empAge;
	private double empSalary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Employee(String firstName, String lastName, int empAge, double empSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

}
