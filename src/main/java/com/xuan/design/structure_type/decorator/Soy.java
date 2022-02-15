package com.xuan.design.structure_type.decorator;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.0f);
    }
}
