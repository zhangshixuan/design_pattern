package com.xuan.design.structure_type.composite;

/**
 * 组合模式
 */
public class Client {

    public static void main(String[] args) {

        OrganizationComponent university = new University("清华大学","中国顶级大学");

        OrganizationComponent college = new College("计算机学院", "这里是学习计算机的学员，这里全是妹子");

        OrganizationComponent department = new Department("软件技术", "学习面对百度编程");

        college.add(department);
        university.add(college);

        university.print();
    }
}
