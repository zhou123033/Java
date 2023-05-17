package com.study.作业.Homework13;

public class Student extends Person{
    private int stu_id;

    public Student(String name, int age, String sex, int stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("好好学习");
    }

    @Override
    public String play() {
        return super.play() + "爱玩足球";
    }

    //编写一个输出信息的方法，这样体现封装
    public void printInfo() {
        System.out.println("学生的信息:");
        System.out.println(super.basicInfo());
        System.out.println("学号：" + stu_id);
        study(); //组合
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                '}' + super.toString();
    }
}
