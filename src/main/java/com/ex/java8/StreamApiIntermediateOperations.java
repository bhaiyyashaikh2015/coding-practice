package com.ex.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiIntermediateOperations {
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
//		Question: combine 2 integer list into one list but without duplicates
		System.out.println("intermediate flatMap() + distinct()");
		List<Integer> l1 = List.of(10, 20, 30, 40);
		List<Integer> l2 = List.of(30, 40, 50, 60);
		List<List<Integer>> l3 = List.of(l1, l2);
		List<Integer> collect9 = l3.stream().flatMap(Collection::stream).distinct().collect(Collectors.toList());
		System.out.println(collect9);
		System.out.println("========================================================");

//		4. distinct
//		Question: Remove duplicate numbers from the list
		System.out.println("intermediate distinct()");
		List<Integer> l4 = List.of(10, 20, 30, 40, 10, 30);
		List<Integer> collect10 = l4.stream().distinct().collect(Collectors.toList());
		System.out.println(l4);
		System.out.println(collect10);
		System.out.println("========================================================");

//		4. distinct
//		Question: Remove duplicate numbers from the list ( because of set - insertion order is not preserved)
		System.out.println("intermediate distinct()");
		List<Integer> l5 = List.of(10, 20, 30, 40, 10, 30);
		Set<Integer> collect11 = l5.stream().collect(Collectors.toSet());
		System.out.println(l5);
		System.out.println(collect11);
		System.out.println("========================================================");

//		5. sorted
//		Question: Sort list of name in alphabetical order
		System.out.println("intermediate sorted()");
		List<String> l6 = List.of("Bhaiyya", "shaikh", "Samir", "Zeeshan", "Ali", "Shaikh", "ali");
		List<String> collect12 = l6.stream().sorted().collect(Collectors.toList());
		System.out.println(l6);
		System.out.println(collect12);
		System.out.println("========================================================");

//		5. sorted
//		Question: Sort list of name in alphabetical order in reverse
		System.out.println("intermediate sorted() REVERSED");
		List<String> l7 = List.of("Bhaiyya", "shaikh", "Samir", "Zeeshan", "Ali", "Shaikh", "ali");
		List<String> collect13 = l7.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(l7);
		System.out.println(collect13);
		System.out.println("========================================================");

//		6. peek --> primarily used for debugging, it allows you to perform an intermediate operation on each element of stream without modifying the stream itself.
//		Question: Sort list of name in alphabetical order in reverse
		System.out.println("intermediate peek()");
		List<String> l8 = List.of("Bhaiyya", "shaikh", "Samir", "Zeeshan", "Ali", "Shaikh", "ali");
		List<String> collect14 = l8.stream().peek(s -> System.out.println("Original Name from DB : " + s))
				.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect14);
		System.out.println("========================================================");
		
//		7. limit
//		Question: Fetch first 3 numbers from the list of integers
		System.out.println("intermediate limit()");
		List<Integer> l9 = List.of(10, 20, 30, 40, 10, 30);
		List<Integer> collect15 = l9.stream().limit(3).collect(Collectors.toList());
		System.out.println(l9);
		System.out.println(collect15);
		System.out.println("========================================================");
		
//		8. skip
//		Question: skip first 2 numbers from the list of integers
		System.out.println("intermediate skip()");
		List<Integer> l10 = List.of(10, 20, 30, 40, 10, 30);
		List<Integer> collect16 = l10.stream().skip(2).collect(Collectors.toList());
		System.out.println(l10);
		System.out.println(collect16);
		System.out.println("========================================================");
	}

}
