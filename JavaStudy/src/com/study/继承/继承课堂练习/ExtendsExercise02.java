package com.study.继承.继承课堂练习;

public class ExtendsExercise02 {
    public static void main(String[] args) { //main方法中，输出什么内容？
    CC cc = new CC();
    }
}

class AA {
    public AA() {
        System.out.println("我是AA类");
    }
}
class BB extends AA { //BB类继承AA类
    public BB() {
        System.out.println("我是BB类的无参构造");
    }
    public BB(String name) {
        System.out.println(name + "我是BB类的有参构造");
    }
}
class CC extends BB { //CC类继承BB类
    public CC() {
        this("hello");
        System.out.println("我是CC类的无参构造");
    }
    public CC(String name) {
        super("hahah");
        System.out.println("我是CC类的有参构造");
    }
}