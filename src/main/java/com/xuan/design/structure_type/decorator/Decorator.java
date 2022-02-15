package com.xuan.design.structure_type.decorator;

public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cast() {
        return super.getPrice() + obj.cast();
    }

    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() + "&&" + obj.getDes();
    }
}
