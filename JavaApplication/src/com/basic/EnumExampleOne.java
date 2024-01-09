package com.basic;

public class EnumExampleOne {

	enum Color
	{
		RED, BLUE, PINK;

		private Color() {
			System.out.println("Constructor called for : " + this.toString());
		}

		public void colorinfo() {
			System.out.println("These are the primary colors");
		}

	}

	public static void main(String[] args) {
		Color color1 = Color.BLUE;
		System.out.println(" : " + color1);
		color1.colorinfo();
	}

}
