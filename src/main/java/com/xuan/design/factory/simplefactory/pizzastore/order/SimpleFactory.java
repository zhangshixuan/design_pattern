package com.xuan.design.factory.simplefactory.pizzastore.order;

import com.xuan.design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xuan.design.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xuan.design.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        }
        return pizza;
    }
}
