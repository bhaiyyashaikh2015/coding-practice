package com.ex.logical.numbers;

public class Swap2Num {

	public static void main(String[] args) {

		int a = 10, b = 20;
		int temp;
		System.out.println("Before swap a=" + a);
		System.out.println("Before swap b=" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swap a=" + a);
		System.out.println("after swap b=" + b);
	}
}
