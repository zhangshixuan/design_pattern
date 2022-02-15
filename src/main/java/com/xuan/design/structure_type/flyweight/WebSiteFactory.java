package com.xuan.design.structure_type.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class WebSiteFactory {

    private Map<String,ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据网站类型获取具体的网站
     * @param type
     * @return
     */
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * 查看网站个数
     * @return
     */
    public int getWebSiteCount() {
        return pool.size();
    }
}
