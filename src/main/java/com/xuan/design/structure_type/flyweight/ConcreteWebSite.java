package com.xuan.design.structure_type.flyweight;

/**
 * 具体享元角色 ConcreteFlyWeight
 */
public class ConcreteWebSite extends WebSite {

    private String type = ""; //网站类型



    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    protected void use(User user) {
        System.out.println("-----------网站发布形式：" + type + "类型-----------" + user.getName() + "正在使用");
    }


}
