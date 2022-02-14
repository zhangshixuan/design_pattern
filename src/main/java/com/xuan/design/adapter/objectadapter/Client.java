package com.xuan.design.adapter.objectadapter;

public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.chongdian(new VoltageAdapter(new Voltage220V()));
    }
}
