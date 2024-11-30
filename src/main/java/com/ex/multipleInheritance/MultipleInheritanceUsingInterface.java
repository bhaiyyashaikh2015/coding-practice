package com.ex.multipleInheritance;

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Implementing methodA from InterfaceA");
    }

    public void methodB() {
        System.out.println("Implementing methodB from InterfaceB");
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}