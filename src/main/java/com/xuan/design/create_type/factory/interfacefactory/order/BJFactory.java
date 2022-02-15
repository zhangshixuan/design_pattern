package com.xuan.design.create_type.factory.interfacefactory.order;

import com.xuan.design.create_type.factory.interfacefactory.pizza.BJCheesePizza;
import com.xuan.design.create_type.factory.interfacefactory.pizza.BJPepperPizza;
import com.xuan.design.create_type.factory.interfacefactory.pizza.Pizza;

public class BJFactory implements AbFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
