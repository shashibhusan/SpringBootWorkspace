package com.basic;

public class EnumExampleTwo {

	enum Colors {
		GREEN, Blue;
		private String name;

		public String getName() {
			return name;
		}

		Colors() {
			System.out.println("This is the construstor");
		}
		public void setName(String name) {
			this.name = name;
		}

	}

	public static void main(String[] args) {
		Colors col1 = Colors.GREEN;
		col1.setName("shashi bhusan");
		System.out.println(" : " + col1.getName());
	}

}
