package com.xuan.design.structure_type.proxy.staticproxy;

/**
 * 静态代理模式
 */
public class Client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象，将目标对象传入
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //调用代理方法，完成具体代理内容
        teacherDaoProxy.tech();
    }
}
