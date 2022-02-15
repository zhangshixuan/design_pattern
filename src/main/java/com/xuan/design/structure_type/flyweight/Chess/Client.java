package com.xuan.design.structure_type.flyweight.Chess;

import java.util.Random;

/**
 * 五子棋 https://www.cnblogs.com/lixin-link/p/11104658.html
 */
public class Client {
    public static void main(String[] args) {
        ChessmanFactory chessmanFactory = ChessmanFactory.getInstance();
        Random random = new Random();
        int radom = 0;

        AbstractChessman abstractChessman = null;
        for (int i = 0; i < 10; i++) {
            radom = random.nextInt(2);
            switch (radom) {
                // 获得黑棋
                case 0:
                    abstractChessman = chessmanFactory.getChessman('B');
                    break;
                // 获得白棋
                case 1:
                    abstractChessman = chessmanFactory.getChessman('W');
                    break;
            }
            if (abstractChessman != null) {
                abstractChessman.point(i,random.nextInt(15));
            }
        }
    }
}
