package com.study.Chapter10;

public class VisitStatic {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println("result" + e.getMessage());
        }
    }
}

