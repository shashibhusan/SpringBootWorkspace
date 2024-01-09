package com.reflection.example;

import java.lang.reflect.Field;

public class ReflectionTutorial {

	public static void main(String[] args) throws Exception {
		Employee employee = new Employee("Shashi Bhusan Patel", "Ballia", 32);
		System.out.println("Employee name before reflection : " + employee.getEmployeeAddress());
		Field employeeFields[] = employee.getClass().getDeclaredFields();

		for (Field fd : employeeFields) {
			if (fd.getName().equals("employeeAddress")) {
				fd.setAccessible(true);
				fd.set(employee, "Noida");
			}
		}
		System.out.println("Employee name after reflection : " + employee.getEmployeeAddress());
	}

}
