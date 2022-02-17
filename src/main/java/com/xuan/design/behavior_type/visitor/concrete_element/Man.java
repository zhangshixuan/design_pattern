package com.xuan.design.behavior_type.visitor.concrete_element;


import com.xuan.design.behavior_type.visitor.element.Person;
import com.xuan.design.behavior_type.visitor.visitor.Action;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
