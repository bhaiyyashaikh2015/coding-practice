package com.ex.logical.numbers;

public class Swap2NumWithoutThirdVar {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("Swap2NumWithoutThirdVar Before swap a=" + a);
		System.out.println("Swap2NumWithoutThirdVar Before swap b=" + b);

		b = b - a;
		a = b + a;
		System.out.println("Swap2NumWithoutThirdVar after swap a=" + a);
		System.out.println("Swap2NumWithoutThirdVar after swap b=" + b);
	}
}
