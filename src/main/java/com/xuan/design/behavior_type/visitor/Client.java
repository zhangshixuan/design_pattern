package com.xuan.design.behavior_type.visitor;

import com.xuan.design.behavior_type.visitor.concrete_element.Man;
import com.xuan.design.behavior_type.visitor.concrete_element.Woman;
import com.xuan.design.behavior_type.visitor.concrete_visitor.Success;
import com.xuan.design.behavior_type.visitor.object_structure.ObjectStructure;

public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

    }
}
