package com.xuan.design.behavior_type.iterator.concrete_aggregate;

import com.xuan.design.behavior_type.iterator.Department;
import com.xuan.design.behavior_type.iterator.aggregate.College;
import com.xuan.design.behavior_type.iterator.concrete_iterator.ComputerCollegeIterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0; //保存当前数组对象个数

    public ComputerCollege() {
        departments = new Department[3];
        addDepartment("Java专业","Java专业");
        addDepartment("大数据专业","大数据专业");
        addDepartment("前端专业","前端专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
