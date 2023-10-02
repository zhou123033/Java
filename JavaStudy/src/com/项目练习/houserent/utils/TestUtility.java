package com.项目练习.houserent.utils;

public class TestUtility {
    public static void main(String[] args) {

        //要求输入一个字符串，长度最大为3
        String s = Utility.readString(3);
        System.out.println("s=" + s);

        //要求输入一个字符串，长度最大为10，如果用户直接回车，就会给一个默认值
        //"edu"
        //就把该方法当作一个API使用即可
        System.out.println("请输入字符串：");
        String s2 = Utility.readString(10, "edu");
        System.out.println("s2=" + s2);
    }
}
