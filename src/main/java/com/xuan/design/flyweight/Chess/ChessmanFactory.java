package com.xuan.design.flyweight.Chess;

import java.util.HashMap;
import java.util.Map;

public class ChessmanFactory {
    private final static ChessmanFactory instance = new ChessmanFactory();
    private Map<Character, AbstractChessman> pool = new HashMap<>();

    private ChessmanFactory(){}

    public static ChessmanFactory getInstance() {
        return instance;
    }

    /**
     * 根据字符获取棋子
     * @param c B:黑棋 W:白棋
     * @return
     */
    public AbstractChessman getChessman(char c) {
        AbstractChessman abstractChessman = pool.get(c);
        if (abstractChessman == null) {
            switch (c) {
                case 'B':
                    abstractChessman = new BlackChessman();
                    break;
                case 'W':
                    abstractChessman = new WhiteChessman();
                    break;
                default:
                    break;
            }
        } else {
            pool.put(c,abstractChessman);
        }
        return abstractChessman;
    }

}
