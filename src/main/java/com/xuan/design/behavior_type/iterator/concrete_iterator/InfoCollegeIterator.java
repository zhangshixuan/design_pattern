package com.xuan.design.behavior_type.iterator.concrete_iterator;

import com.xuan.design.behavior_type.iterator.Department;

import java.util.Iterator;
import java.util.List;

/**
 * 信息工程系
 */
public class InfoCollegeIterator implements Iterator {

    private List<Department> departmentList;
    private int index = 0;//索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departmentList.get(index);
        index += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
