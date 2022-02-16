package com.xuan.design.structure_type.proxy.cglib;


/**
 * 因为在实际开发中可能需要在不修改源码的基础上增强代码
 * 或者把业务代码和通用代码分离开来以提高开发效率
 * 代理模式可以很好地实现这两者的需求
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
//        String teach = proxyInstance.teach();
//        System.out.println("teach :" + teach);

        proxyInstance.sayHello("周杰伦");
    }
}
