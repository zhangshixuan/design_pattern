package com.xuan.design.decorator;

public class Coffee extends Drink {
    @Override
    public float cast() {
        return super.getPrice();
    }
}
