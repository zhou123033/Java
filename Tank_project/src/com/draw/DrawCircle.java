package com.draw;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{ //JFrame对应窗口，可以理解成是一个画框

    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口的大小
        this.setSize(400, 300);
        //当点击窗口的小叉，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); //可以显示
    }
}

//1.先定义一个面板MyPanel，继承JPanel类，画图形就在面板上画
class MyPanel extends JPanel {

    //说明：
    //1. MyPanel 对象就是一个画板
    //2. Graphics g 把g理解成一支画笔
    //3. Graphics 提供了很多绘图的方法
    //Graphics g
    @Override
    public void paint(Graphics g) { //绘图方法
        super.paint(g); //调用父类的方法完成初始化
        System.out.println("paint 方法被调用了");
        //画出一个圆形
        g.drawOval(10, 10, 100, 100);

        //演示绘制不同的图形
        //画直线
        //g.drawLine(10, 10, 100, 100);
        //设置画笔的颜色
    }
}
