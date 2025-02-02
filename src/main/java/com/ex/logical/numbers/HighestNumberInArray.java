package com.ex.logical.numbers;

import java.util.ArrayList;

public class HighestNumberInArray {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(55);
		a1.add(20);
		a1.add(90);
		a1.add(100);
		a1.add(30);
		a1.add(35);

		int highest = a1.get(0);

		for (int i = 1; i < a1.size(); i++) {
			if (highest < a1.get(i)) {
				highest = a1.get(i);
			}
		}

		System.out.println("Highest number is ==> " + highest);
	}
}
