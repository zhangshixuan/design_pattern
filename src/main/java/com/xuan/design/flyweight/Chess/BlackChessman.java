package com.xuan.design.flyweight.Chess;

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
