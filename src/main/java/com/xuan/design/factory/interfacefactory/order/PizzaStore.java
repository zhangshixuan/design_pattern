package com.xuan.design.factory.interfacefactory.order;

/**
 * 工厂模式
 */
public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());
	}

}
