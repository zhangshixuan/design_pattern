package com.xuan.design.behavior_type.visitor.concrete_visitor;

import com.xuan.design.behavior_type.visitor.concrete_element.Man;
import com.xuan.design.behavior_type.visitor.concrete_element.Woman;
import com.xuan.design.behavior_type.visitor.visitor.Action;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男性评价该歌手是成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性评价该歌手是成功");
    }
}
