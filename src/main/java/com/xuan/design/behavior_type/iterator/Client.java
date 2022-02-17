package com.xuan.design.behavior_type.iterator;

import com.xuan.design.behavior_type.iterator.aggregate.College;
import com.xuan.design.behavior_type.iterator.concrete_aggregate.ComputerCollege;
import com.xuan.design.behavior_type.iterator.concrete_aggregate.InfoCollege;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutputImpl outPutImpl = new OutputImpl(collegeList);
        outPutImpl.printCollege();
    }
}
