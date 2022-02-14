package com.xuan.design.bridge;

/**
 * 桥接模式
 */
public class Client {

    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
    }
}
