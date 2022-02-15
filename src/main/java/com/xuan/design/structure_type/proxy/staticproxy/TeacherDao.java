package com.xuan.design.structure_type.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void tech() {
        System.out.println("老师授课中。。。。。");
    }
}
