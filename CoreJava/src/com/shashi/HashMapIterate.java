package com.shashi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterate {
	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("shashi", "bhusan");
		hashMap.put("Raghavendra", "Singh");
		hashMap.put("Rahul", "singh");
		hashMap.put("Devendra", "Yadav");
		System.out.println("Value inside the map are : ");
		Iterator<Entry<String, String>> it = hashMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(" " + me.getKey() + " " + me.getValue());
		}
		for (Map.Entry me2 : hashMap.entrySet()) {
			System.out.println(" " + me2.getKey() + "  " + me2.getValue());
		}
	}

}
