package com.ex.java8;

import java.util.ArrayList;
import java.util.List;

public class SortEmpListByAge {

	public static void main(String[] args) {

		List<Employee> empList = List.of(new Employee("Kiran", 27), new Employee("Bhaiyya", 28),
				new Employee("vivek", 17));
		List<Employee> empList2 = new ArrayList<>();
		System.out.println("empList before sorting ==> " + empList);

//			empList.sort((o1, o2) -> o2.getAge() - o1.getAge());
//			System.out.println(empList);

			for (int i = 0; i < empList.size(); i++) {
				for (int j = 0; j < empList.size(); j++) {
					System.out.println("emp i " +empList.get(i));
					System.out.println("emp j " +empList.get(j));
					
					if (empList.get(i).getAge() > empList.get(j).getAge()) {
						empList2.add(empList.get(i));
					}
				}
			}
		
	}

}
