package com.xuan.design.prototype;

/**
 * 原型模式
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.friend= new Sheep("jack",1,"白色");
        Sheep clone = (Sheep)sheep.clone();
        System.out.println(sheep);
        System.out.println(clone);
        System.out.println(sheep == clone);
    }
}
