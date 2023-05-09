package com.项目练习.houserent;

import com.项目练习.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单，是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("====你退出了房屋出租系统====");
    }
}

