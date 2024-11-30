package com.ex.multipleInheritance;

interface InterfaceA2 {
	default void show() {
		System.out.println("From InterfaceA");
	}
}

interface InterfaceB2 {
	default void show() {
		System.out.println("From InterfaceB");
	}
}

class MyClass2 implements InterfaceA2, InterfaceB2 {
	@Override
	public void show() {
		// Resolving the conflict
		InterfaceA2.super.show();
		InterfaceB2.super.show();
		System.out.println("From MyClass");
	}

}

public class MultipleInheritanceUsingDefaultMethods {
	public static void main(String[] args) {
		MyClass2 obj = new MyClass2();
		obj.show();
	}
}
