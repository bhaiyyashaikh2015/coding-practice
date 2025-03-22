package com.ex.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllEmployeeNameInString {

	public static void main(String[] args) {
		List<Employee> empList = List.of(new Employee("bhaiyya", 28), new Employee("javed", 26),
				new Employee("ritesh", 27));
		List<String> collect = empList.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
		
		String s1 = "";
		for (int i = 0; i < collect.size(); i++) {
			if (i == collect.size()-1)
				s1 = s1 + collect.get(i);
			else
				s1 = s1 + collect.get(i) + " | ";
		}
		
		System.out.println(s1);
		
		System.out.println("====================================================================");
		
		String collect2 = empList.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.joining(" | "));
		System.out.println(collect2);
		
		System.out.println("====================================================================");
		
		List<String> srtingList = List.of("apple", "banana", "apricot", "cherry", "blueberry", "avocado");
		List<Character> collect3 = srtingList.stream().map(s->s.charAt(0)).collect(Collectors.toList());
		System.out.println(collect3);
		
		System.out.println("====================================================================");
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : collect3) {
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);

			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		System.out.println("====================================================================");
		
//		srtingList.stream().map(s->s.charAt(0)).collect(Collectors.tom);
	}

}
