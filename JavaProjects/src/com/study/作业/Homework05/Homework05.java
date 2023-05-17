package com.study.作业.Homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.printSal();
        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();
        Teacher han = new Teacher("Han", 2000);
        han.printSal();

        Scientist scientist = new Scientist("Zhong", 20000);
        scientist.setBonus(2000000);
        scientist.printSal();
    }
}
