package com.study.Chapter10;

public class ChildGame { //类
    public static void main(String[] args) {

    }
}

class Child { //类
    private String name;
    //定义一个变量 count，是一个类变量(静态变量) static 静态
    //该变量最大的特点就是会被Child 类的所有的对象实例共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + " 加入了游戏");
    }
}
