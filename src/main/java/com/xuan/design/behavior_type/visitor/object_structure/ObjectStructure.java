package com.xuan.design.behavior_type.visitor.object_structure;

import com.xuan.design.behavior_type.visitor.element.Person;
import com.xuan.design.behavior_type.visitor.visitor.Action;

import java.util.LinkedList;
import java.util.List;

//数据结构，管理很多人
public class ObjectStructure {

    private List<Person> personList = new LinkedList<>();

    public void attach(Person p){
        personList.add(p);
    }

    public void detach(Person p) {
        personList.remove(p);
    }
    //显示测评情况
    public void display(Action action) {
        for (Person p : personList) {
            p.accept(action);
        }
    }
}
