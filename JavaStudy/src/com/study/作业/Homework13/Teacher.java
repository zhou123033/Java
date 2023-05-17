package com.study.作业.Homework13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, int age, String sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("认真教学");
    }

    @Override
    public String play() {
        return super.play() + "爱玩象棋";
    }
    //输出信息方法
    public void printInfo() {
        System.out.println("老师的信息:");
        System.out.println(super.basicInfo());
        System.out.println("工龄：" + work_age);
        teach(); //组合
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
