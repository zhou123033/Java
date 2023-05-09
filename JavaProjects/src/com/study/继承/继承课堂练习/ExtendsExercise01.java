package com.study.继承.继承课堂练习;

public class ExtendsExercise01 {
    public static void main(String[] args) {
    B b = new B();
    }
}

class A {
    A() {
        System.out.println("a");
    }
    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }
    B(String name) {
        //先调用父类构造器，有个隐藏的super();
        System.out.println("b name");
    }
}