package com.xuan.design.adapter.classadapter;

/**
 * 适配器模式
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.chongdian(new VoltageAdapter());
    }
}
