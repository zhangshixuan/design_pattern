package com.xuan.design.flyweight.Chess;

public class WhiteChessman extends AbstractChessman {
    public WhiteChessman() {
        super("白棋");
        System.out.println("--WhiteChessman  Construction Exec!!!");
    }

    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        super.show();
    }
}
