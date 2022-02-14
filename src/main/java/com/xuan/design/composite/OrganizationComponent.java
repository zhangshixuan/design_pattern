package com.xuan.design.composite;

public abstract class OrganizationComponent {
    private String name;
    private String des;

    protected void add(OrganizationComponent o) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent o) {
        throw new UnsupportedOperationException();
    }

    //打印方法
    protected abstract void print();

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
