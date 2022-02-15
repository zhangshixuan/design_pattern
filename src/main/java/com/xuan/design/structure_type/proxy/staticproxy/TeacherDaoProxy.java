package com.xuan.design.structure_type.proxy.staticproxy;

/**
 * 静态代理对象
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;// 通过接口聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    /**
     * 可以写一些增强代码
     */
    @Override
    public void tech() {
        System.out.println("代理老师授课，完成一些上课内容");
        target.tech();
        System.out.println("提交。。。。。。。。。。");
    }
}
