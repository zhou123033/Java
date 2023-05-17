package com.study.作业.Homework13;

public class Homework13 {
    public static void main(String[] args) {
        //测试
        Student student = new Student("小明", 15, "男", 12345);
        student.printInfo(); //封装

        Teacher teacher = new Teacher("Zhang", 30, "男", 5);
        System.out.println("----------");
        teacher.printInfo();

        //定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", 18,"男",0001);
        persons[1] = new Student("mary", 20,"女",0002);
        persons[2] = new Teacher("smith", 36,"男",5);
        persons[3] = new Teacher("sccot", 26,"男",1);

        //创建对象
        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        //输出排序后的数组的
        System.out.println("----排序后的数组----");
        for(int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        //遍历数组，调用test方法
        System.out.println("==========");
        for(int i = 0; i < persons.length; i++) { //遍历多态数组
            homework13.test(persons[i]);
        }
    }

    //定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
    //分析这里会使用到向下转型和类型判断
    public void test(Person p) {
        if(p instanceof Student) {//p的运行类型如果是Student
            ((Student) p).study();
        }else if(p instanceof  Teacher) {
            ((Teacher) p).teach();
        }else {
            System.out.println("do nothing...");
        }
    }
    //方法，完成年龄从高到低排序
    public void bubbleSort(Person[] persons) {
        Person temp = null;
        for(int i = 0; i < persons.length - 1; i++) {
            for(int j = 0; j < persons.length - 1 - i; j++) {
                //判断条件，注意这里的条件可以根据需要变化
                if(persons[j].getAge() < persons[j+1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
     }

}
