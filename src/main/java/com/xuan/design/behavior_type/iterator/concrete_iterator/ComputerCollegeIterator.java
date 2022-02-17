package com.xuan.design.behavior_type.iterator.concrete_iterator;

import com.xuan.design.behavior_type.iterator.Department;

import java.util.Iterator;

/**
 * 计算机系
 */
public class ComputerCollegeIterator implements Iterator {

    //这是我们必须要知道，Department是以什么形式存放的
    Department[] departments;

    int position = 0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个
     * @return
     */
    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
