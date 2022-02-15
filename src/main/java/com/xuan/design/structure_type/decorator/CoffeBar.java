package com.xuan.design.structure_type.decorator;

/**
 * 装饰者模式
 */
public class CoffeBar {

    public static void main(String[] args) {
        Drink order = new DeCaf();
        order = new Chocolate(new Milk(order));

        System.out.println(order.getDes() + "========无因咖啡+牛奶+巧克力====" + order.cast());
    }
}
