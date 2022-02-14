package com.xuan.design.singleton;

public class SingletonTest02 {

    public static void main(String[] args) {
        StaticSingleton instance = StaticSingleton.getInstance();
        StaticSingleton instance1 = StaticSingleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/**
 * 饿汉式（静态代码块）
 */
class StaticSingleton {

    private StaticSingleton() {}

    private static StaticSingleton instance;

    static {
        instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return instance;
    }
}
