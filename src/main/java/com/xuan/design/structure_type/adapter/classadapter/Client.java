package com.xuan.design.structure_type.adapter.classadapter;

/**
 * 适配器模式
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.chongdian(new VoltageAdapter());
    }
}
