package com.xuan.design.structure_type.bridge.bank;

public class Client {
    public static void main(String[] args) {
        UserType common = new CommonUser(new Online());
        common.transfer();
    }
}
