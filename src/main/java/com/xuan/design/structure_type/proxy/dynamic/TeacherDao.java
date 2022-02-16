package com.xuan.design.structure_type.proxy.dynamic;

public class TeacherDao implements ITeacherDao {
    @Override
    public void tech() {
        System.out.println("老师正在授课中。。。。");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
