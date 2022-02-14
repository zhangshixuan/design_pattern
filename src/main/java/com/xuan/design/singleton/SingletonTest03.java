package com.xuan.design.singleton;

public class SingletonTest03 {

    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        SingletonLazy instance1 = SingletonLazy.getInstance();
        System.out.println(instance == instance1);
    }
}

/**
 * 懒汉式（双重验证加载）
 * 开发中推荐使用
 */
class SingletonLazy {

    private SingletonLazy() {}

    private static volatile SingletonLazy instance;


    public static SingletonLazy getInstance() {

        if (instance == null) {
            synchronized(SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }

        return instance;
    }


}
