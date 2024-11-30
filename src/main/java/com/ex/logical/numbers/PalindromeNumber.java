package com.ex.logical.numbers;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 131;
		int temp = num;
		int newNum = 0;
		
//		while (num > 0) {
//			newNum = newNum * 10;
//			int rem = num % 10;
//			newNum = newNum + rem;
//			num = num / 10;
//		}
//		System.out.println(newNum);

//		OR
		while (num > 0) {
			newNum = newNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(newNum);

		if (temp == newNum)
			System.out.println(temp + " Number is palindrome");
		else
			System.out.println(temp + " Number is not palindrome");

	}

}
