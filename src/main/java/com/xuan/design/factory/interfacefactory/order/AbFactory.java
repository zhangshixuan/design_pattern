package com.xuan.design.factory.interfacefactory.order;

import com.xuan.design.factory.interfacefactory.pizza.Pizza;

public interface AbFactory {

    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}
