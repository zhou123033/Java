package com.study.Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 自定义Book类，里面包含name和price，按price排序（从大到小）。要求使用两种方式排序，有一个
 * Book[] books = 4 本书对象
 * 使用前面学习过的传递，实现Comparator接口匿名内部类，也称为定制排序，可以按照price:
 * (1)从大到小
 * (2)从小到大
 * (3)按照书名长度从大到小
 */
public  class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃", 300);

        //1.按照价格 price 从大到小排序
        Arrays.sort(books, new Comparator() {
            //这里是对Book数组排序，因此 o1 和 o2 就是Book对象
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                double priceVal = book2.getPrice() - book1.getPrice();
                //这里进行了一个转换
                //如果发现结果和输出的不一致，就调换一下返回的 1 和 -1
                if(priceVal > 0) {
                    return 1;
                } else if(priceVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}