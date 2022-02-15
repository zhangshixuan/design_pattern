package com.xuan.design.flyweight.Chess;

/**
 * 抽象享元角色
 */
public abstract class AbstractChessman {
    //坐标
    protected int x;
    protected int y;

    //棋子类型(内部状态，黑棋和白棋的颜色不会发生改变)
    protected String chessType;

    public AbstractChessman(String chessType) {
        this.chessType = chessType;
    }

    //下棋（外部状态，黑棋白棋位置会发生改变）
    public abstract void point(int x,int y);

    //显示棋子信息
    public void show() {
        System.out.println(this.chessType + "位置：(" + x + ", " + y + ")");
    }
}
