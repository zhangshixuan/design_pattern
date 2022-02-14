package com.xuan.design.facade;

/**
 * 爆米花机
 */
public class Popcorn {
    private Popcorn() {
    }

    //饿汉式
    private final static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }


    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println("popcorn off");
    }

    public void pop(){
        System.out.println("popcorn is poping");
    }
}
