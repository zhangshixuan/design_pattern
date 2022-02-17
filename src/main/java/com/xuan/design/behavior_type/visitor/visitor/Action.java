package com.xuan.design.behavior_type.visitor.visitor;

import com.xuan.design.behavior_type.visitor.concrete_element.Man;
import com.xuan.design.behavior_type.visitor.concrete_element.Woman;

public abstract class Action {

    //得到男性的测评
    public abstract void getManResult(Man man);
    //得到女性的测评
    public abstract void getWomanResult(Woman woman);

}
