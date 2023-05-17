package com.study.作业.Homework04;

public class Worker extends Employee {
    //分析普通员工没有特有的属性

    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    //重写printSal
    //因为普通员工和Employee输出工资情况一样，所以直接调用父类的printSal()
    @Override
    public void printSal() {
        super.printSal();
    }

}
