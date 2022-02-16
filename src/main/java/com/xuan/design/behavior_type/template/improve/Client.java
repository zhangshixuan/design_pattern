package com.xuan.design.behavior_type.template.improve;

public class Client {

    public static void main(String[] args) {
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();


        //纯豆浆
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
