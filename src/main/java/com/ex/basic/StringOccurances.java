package com.ex.basic;

import java.util.HashMap;
import java.util.Map;

public class StringOccurances {

	public static void main(String[] args) {
		String s = "Bhaiyya Shaikh will be Bhaiyya shaikh";

		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] stringArray = s.split(" ");

		for (String c : stringArray) {
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);

			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}