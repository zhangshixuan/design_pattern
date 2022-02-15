package com.xuan.design.structure_type.flyweight;

/**
 * 享元模式（蝇量模式）
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite newsWeb = webSiteFactory.getWebSiteCategory("新闻");


        newsWeb.use(new User("周杰伦"));


        System.out.println("网站多少个？" + webSiteFactory.getWebSiteCount());
    }
}
