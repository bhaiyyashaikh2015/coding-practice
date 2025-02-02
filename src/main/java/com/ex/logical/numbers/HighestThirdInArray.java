package com.ex.logical.numbers;

import java.util.ArrayList;

public class HighestThirdInArray {

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

		int secondHighest = Integer.MIN_VALUE;

		System.out.println("Integer.MIN_VALUE ==> " + Integer.MIN_VALUE);

		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i) > secondHighest && a1.get(i) < highest) {
				secondHighest = a1.get(i);
			}
		}

		System.out.println("Second Highest number is ==> " + secondHighest);

		int thirdHighest = Integer.MIN_VALUE;

		System.out.println("Integer.MAX_VALUE ==> " + Integer.MAX_VALUE);

		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i) > thirdHighest && a1.get(i) < secondHighest) {
				thirdHighest = a1.get(i);
			}
		}

		System.out.println("Second Highest number is ==> " + thirdHighest);
	}
}
