package com.ex.logical.strings;

import java.util.HashMap;
import java.util.Map;

public class CharOccurances {

	public static void main(String[] args) {
		String s = "Bhaiyya is Bhaiyya";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = s.toCharArray();

		for (Character c : charArray) {
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