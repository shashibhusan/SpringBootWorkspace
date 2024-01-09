package com.pending;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {

	private int empId;
	private String department;
	private int age;

	public Employee(int empId, String department, int age) {
		super();
		this.empId = empId;
		this.department = department;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee em) {
		if (age == em.age) {
			return 0;
		} else if (age > em.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparableExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "d1", 31);
		Employee e2 = new Employee(2, "d2", 33);
		Employee e3 = new Employee(11, "d1", 30);
		Employee e4 = new Employee(19, "d1", 29);
		ArrayList<Employee> ls = new ArrayList<Employee>();
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		ls.add(e4);
		Collections.sort(ls);
		for (Employee e : ls) {
			System.out.println(e.getAge());
		}

	}

}
