package com.study.作业.Homework04;

public class Homework04 {
    public static void main(String[] args) {
        Manager manage = new Manager("Zhang", 100, 20, 1.2);
        //设置奖金
        manage.setBonus(3000);
        //打印经理的工资情况
        manage.printSal();

        Worker worker = new Worker("Guan", 50, 10, 1.0);
        worker.printSal();
    }
}
