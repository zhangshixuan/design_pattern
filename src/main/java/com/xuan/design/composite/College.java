package com.xuan.design.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    //list种存放department
    private List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    //
    @Override
    protected void print() {
        System.out.println(getName() + ":" + getDes());
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }

    @Override
    protected void add(OrganizationComponent o) {
        organizationComponentList.add(o);
    }

    @Override
    protected void remove(OrganizationComponent o) {
        organizationComponentList.remove(o);
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
