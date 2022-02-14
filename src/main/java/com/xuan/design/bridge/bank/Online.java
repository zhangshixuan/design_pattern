package com.xuan.design.bridge.bank;

public class Online implements PlantForm{
    @Override
    public void transfer() {
        System.out.println("网上转账");
    }
}
