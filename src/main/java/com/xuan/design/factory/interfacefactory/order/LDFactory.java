package com.xuan.design.factory.interfacefactory.order;

import com.xuan.design.factory.interfacefactory.pizza.LDCheesePizza;
import com.xuan.design.factory.interfacefactory.pizza.LDPepperPizza;
import com.xuan.design.factory.interfacefactory.pizza.Pizza;

public class LDFactory implements AbFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
