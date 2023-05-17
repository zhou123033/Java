package com.study.Object类;

public class ObjectExercise02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "edu";

        Person p2 = new Person();
        p2.name = "edu";

        System.out.println(p1==p2);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.equals(p2));

        String s1 = new String("asdf");
        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));
    }
}
class Person{
    public String name;
}