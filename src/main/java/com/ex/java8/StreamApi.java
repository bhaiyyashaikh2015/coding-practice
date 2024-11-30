package com.ex.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {

//		1. filter
//		Question: Fetch all numbers from a list that are greater than 5.
		System.out.println("intermediate filter()");
		List<Integer> numList = List.of(25, 5, 2, 15, 4, 7, 10, 1, 999);
		List<Integer> collect = numList.stream().filter(n -> n > 5).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("========================================================");

//		1. filter
//		Question: print all employee whose age is greater than 18.
		System.out.println("intermediate filter()");
		List<Employee> empList = List.of(new Employee("Kiran", 17), new Employee("Bhaiyya", 28),
				new Employee("vivek", 15), new Employee("zeeshan", 32), new Employee("javed", 18));
		List<Employee> collect4 = empList.stream().filter(e -> e.getAge() > 18).collect(Collectors.toList());
		System.out.println(collect4);
		System.out.println("========================================================");

//		2. map
//		Question: Transform a list of strings into a list of their uppercase versions
		System.out.println("intermediate map()");
		List<String> strList = List.of("Bhaiyya", "shaikh", "SaMiR");
		List<String> collect2 = strList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect2);
		List<String> collect3 = strList.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(collect3);
		System.out.println("========================================================");

//		2. map
//		Question: print all employee names only.
		System.out.println("intermediate map()");
		List<Employee> empList2 = List.of(new Employee("Kiran", 17), new Employee("Bhaiyya", 28),
				new Employee("vivek", 15), new Employee("zeeshan", 32), new Employee("javed", 18));
		List<String> collect5 = empList2.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(collect5);
		System.out.println("========================================================");

//		Question: print all employee names only whose age is greater than 18.
		System.out.println("intermediate filter() + map()");
		List<Employee> empList3 = List.of(new Employee("Kiran", 17), new Employee("Bhaiyya", 28),
				new Employee("vivek", 15), new Employee("zeeshan", 32), new Employee("javed", 18));
		List<String> collect6 = empList3.stream().filter(e -> e.getAge() > 18).map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(collect6);
		System.out.println("========================================================");

//		3. flatMap--> from list of list get internal list 
//		e.g list of orders may have list of items
//		Question: Given a list of lists of strings, flatten them into a single list of strings.
		System.out.println("intermediate flatMap()");
		List<List<String>> asList = Arrays.asList(Arrays.asList("one", "two"), Arrays.asList("three", "four"));
		List<String> collect7 = asList.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(collect7);
		System.out.println("========================================================");

//		3. flatMap--> from list of list get internal list 
//		e.g list of orders may have list of items
//		Question: print all items sold
		System.out.println("intermediate flatMap()");
		List<Item> kidsItem = List.of(new Item("pen"), new Item("pencil"), new Item("book"));
		List<Item> mensItem = List.of(new Item("pant"), new Item("shirt"), new Item("jacket"));
		List<Order> orderList = List.of(new Order(kidsItem), new Order(mensItem));
		List<Item> collect8 = orderList.stream().flatMap(order -> order.getItemList().stream())
				.collect(Collectors.toList());
		System.out.println(collect8);
		long count = orderList.stream().flatMap(order -> order.getItemList().stream()).count();
		System.out.println("total items sold ==> " + count);
		System.out.println("========================================================");

//		3. flatMap--> from list of list get internal list 
//		e.g list of orders may have list of items
//		Question: combine 2 integer list into one list but without duplicates
		System.out.println("intermediate flatMap() + distinct()");
		List<Integer> l1 = List.of(10, 20, 30, 40);
		List<Integer> l2 = List.of(30, 40, 50, 60);
		List<List<Integer>> l3 = List.of(l1, l2);
		List<Integer> collect9 = l3.stream().flatMap(Collection::stream).distinct().collect(Collectors.toList());
		System.out.println(collect9);
		System.out.println("========================================================");

//		3. flatMap--> from list of list get internal list 
//		Question: Remove duplicate numbers from the list
		System.out.println("intermediate distinct()");
		List<Integer> l4 = List.of(10, 20, 30, 40, 10, 30);
		List<Integer> collect10 = l4.stream().distinct().collect(Collectors.toList());
		System.out.println(l4);
		System.out.println(collect10);
		System.out.println("========================================================");

	}

}
