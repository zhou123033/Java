package com.study.多态.多态参数;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("普通员工 " + getName() + " is working.");
    }

    @Override
    public double getAnnual() { //因为普通员工没有其他收入，则直接调用父类方法
        return super.getAnnual();
    }
}
