package com.study.作业.Homework03;

//子类
public class Professor extends Teacher{

    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce() {
        System.out.println(" 这是教授的信息 ");
        super.introduce();
    }
}
