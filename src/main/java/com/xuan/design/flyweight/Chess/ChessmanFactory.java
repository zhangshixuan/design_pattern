package com.xuan.design.flyweight.Chess;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class ChessmanFactory {
    private final static ChessmanFactory instance = new ChessmanFactory();

    //创建一个容器池
    private Map<Character, AbstractChessman> pool = new HashMap<>();

    private ChessmanFactory(){}

    public static ChessmanFactory getInstance() {
        return instance;
    }

    /**
     * 从容器池中获取方法
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
