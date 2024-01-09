package com.dailyWork;

import java.util.HashMap;
import java.util.Map;

public class TestProgram {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("shashi", "shashi");
		map.put("shashi", "shashi");
		map.put("shashi", "shashi");

		System.out.println(map.size());
	}
}
