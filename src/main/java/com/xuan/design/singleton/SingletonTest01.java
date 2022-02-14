package com.xuan.design.singleton;

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/**
 * 饿汉式
 */
class Singleton {

    private Singleton() {}

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
