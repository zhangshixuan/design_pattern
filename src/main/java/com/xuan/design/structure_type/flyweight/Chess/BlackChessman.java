package com.xuan.design.structure_type.flyweight.Chess;


/**
 * 具体享元角色
 */
public class BlackChessman extends AbstractChessman {
    public BlackChessman() {
        super("黑棋");
        System.out.println("--BlackChessman Construction Exec!!!");
    }

    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        show();
    }
}
