package com.项目练习.houserent.view;

import com.项目练习.houserent.domain.House;
import com.项目练习.houserent.service.HouseService;
import com.项目练习.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true; //控制显示菜单
    private char key = ' '; //接收用户选择
    private HouseService houseService = new HouseService(2); //设置数组的大小为2

    //完成退出确认
    public void exit() {
        //使用Utility提供方法，完成确认
        char c = Utility.readConfirmSelection();
        if(c == 'Y') {
            loop = false;
        }
    }

    //编写delHouse() 接收输入的id，调用Service 的del方法
    public void delHouse() {
        System.out.println("========添加房屋信息========");
        System.out.println("请输入待删除房屋的编号(-1退出):");
        int delId = Utility.readInt();
        if(delId == -1) {
            System.out.println("========放弃删除房屋信息========");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y') {//真的删除
            if(houseService.del(delId)) {
                System.out.println("========删除房屋信息成功========");
            }else{
                System.out.println("========房屋编号不存在，删除失败========");
            }
        } else {
            System.out.println("========放弃删除房屋信息========");
        }
    }

    //编写addHouse() 接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("========添加房屋========");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的，用户不能输入
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)) {
            System.out.println("====添加房屋成功====");
        }else{
            System.out.println("====添加房屋失败====");
        }
    }

    //编写listHouses()显示房屋列表
    public void listHouses() {
        System.out.println("========房屋列表========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list(); //得到所有房屋信息

        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("========房屋列表显示完毕========");
    }
    //显示主菜单
    public void mainMenu() {

        do{
            System.out.println("========房屋出租系统========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 信 息");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    System.out.println("查 找");
                    break;
                case '3' :
                    delHouse();
                    break;
                case '4' :
                    System.out.println("修 改");
                    break;
                case '5' :
                    listHouses();
                    break;
                case '6' :
                    exit();
                    break;
            }
        }while(loop);
    }
}
