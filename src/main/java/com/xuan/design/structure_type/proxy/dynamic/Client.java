package com.xuan.design.structure_type.proxy.dynamic;

public class Client {

    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao(); // 被代理对象

        //给目标对象创建代理对象
        ITeacherDao proxyInstance  = (ITeacherDao)new ProxyFactory(target).getProxyIntance();
//        proxyInstance.tech();
        proxyInstance.sayHello("周杰伦");
    }

}
