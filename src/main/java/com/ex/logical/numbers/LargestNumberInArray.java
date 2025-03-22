package com.ex.logical.numbers;

public class LargestNumberInArray {
	public static void main(String[] args) {
		int[] a = { 11, 3, 1, 8, 5, 2, 11, 9, 14, 6, 55 };
		int l1 = a[0], l2 = 0, l3 = 0;
		for (int i = 1; i < a.length; i++) {
			if (l1 < a[i]) {
				l1 = a[i];
			}
			else if ( l2 < a[i] && l1 > l2) {
				l2 = a[i];
			}
			else if ( l3 < a[i] && l2 > l3) {
				l3 = a[i];
			}
		}
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}

}
