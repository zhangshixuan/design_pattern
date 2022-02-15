package com.xuan.design.structure_type.decorator;

public abstract class Drink {

    public String des;

    private float price = 0.0f;

    //计算价格，字类实现
    public abstract float cast();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
