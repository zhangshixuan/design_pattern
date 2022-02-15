package com.xuan.design.structure_type.composite;

public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    //没有集合

    //没有add和remove方法


    @Override
    protected void print() {
        System.out.println(getName() + ":" + getDes());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
