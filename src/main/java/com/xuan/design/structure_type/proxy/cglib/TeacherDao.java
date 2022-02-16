package com.xuan.design.structure_type.proxy.cglib;

public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "周杰伦";
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
