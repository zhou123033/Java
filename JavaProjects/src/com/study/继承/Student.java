package com.study.继承;

public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;
    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名字 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
