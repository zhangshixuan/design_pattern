package com.xuan.design.behavior_type.iterator.aggregate;

import java.util.Iterator;

public interface College {

    String getName();

    /**
     * 添加系
     * @param name
     * @param des
     */
    void addDepartment(String name, String des);

    /**
     * 返回迭代器
     * @return
     */
    Iterator createIterator();

}
