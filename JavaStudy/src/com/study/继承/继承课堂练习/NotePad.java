package com.study.继承.继承课堂练习;

//编写NotePad子类，继承Computer类，添加特有属性（演示color）
public class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printInfo() {
        System.out.println("NotePad信息=");
        System.out.println(getDetails() + " color=" + color);
    }
}
