package com.pending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	private int age;
	private String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class StudentAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getAge() == s2.getAge()) {
			return 0;
		} else if (s1.getAge() > s2.getAge()) {
			return 1;
		} else {
			return -1;
		}

	}

}

class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		Student s1 = new Student(35, "Shashi");
		Student s2 = new Student(32, "Raghu");
		Student s3 = new Student(33, "Devendra");
		Student s4 = new Student(30, "Pradeep");

		ArrayList<Student> studentArray = new ArrayList<>();
		studentArray.add(s1);
		studentArray.add(s2);
		studentArray.add(s3);
		studentArray.add(s4);

		Collections.sort(studentArray, new StudentNameComparator());
		for (Student s : studentArray) {
			System.out.println(s.getAge() + " " + s.getName());
		}
	}

}
