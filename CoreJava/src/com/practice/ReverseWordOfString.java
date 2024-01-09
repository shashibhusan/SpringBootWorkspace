package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordOfString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("shashi");
		list.add("bhusan");
		list.add("patel");
		list.add("raghu");
		list.add("abhishek");
		list.add("sanjeev");
		Collections.reverse(list);
		for (String st : list) {
			// System.out.print(" " + st);
		}

		String abc = "shashi bhusan patel raghu abhishek sanjeev";
		String[] stArray = abc.split(" ");
		for (String st : stArray) {
			// System.out.print(" " + st);
		}
		for (int i = stArray.length - 1; i >= 0; i--) {
			System.out.print(" " + stArray[i]);
		}
	}

}
