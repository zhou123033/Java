package com.study.多态;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //主人给小狗 喂食 骨头
    public void feed(Dog dog, Bone bone) {
        System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃" + bone.getName());
    }

    //主人给小猫 喂黄花鱼
    public void feed(Cat cat, Fish fish) {
        System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃" + fish.getName());
    }
}
