package com.study.作业.Homework05;

public class Teacher extends Employee {
    //特有属性
    private int classDay; //一年上课次数
    private double classSal; //课时费

    public Teacher(String name, double sal) {
        super(name, sal);
    }
    //方法-重写printSal

    @Override
    public void printSal() { //不能使用super.printSal()
        System.out.print("老师 ");
        System.out.println(getName() + " 年工资是: "
                + (getSal() * getSalMonth() + classDay * classSal));
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}
