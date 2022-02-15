package com.xuan.design.structure_type.decorator;

public class Coffee extends Drink {
    @Override
    public float cast() {
        return super.getPrice();
    }
}
