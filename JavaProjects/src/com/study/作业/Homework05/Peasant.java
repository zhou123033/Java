package com.study.作业.Homework05;

public class Peasant extends Employee { //子类
    //属性

    //方法
    public Peasant(String name, double sal) {
        super(name, sal);
    }
    //年工资
    @Override
    public void printSal() {
        System.out.print("农民 ");
        super.printSal();
    }
}
