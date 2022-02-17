package com.xuan.design.behavior_type.iterator.jdk;

import java.util.*;

public class IteratorResource {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("jack");// ..
        // 获取到迭代器
        Iterator Itr = a.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }

        Map<String,String> objects = new Hashtable<>();
        objects.put("123","一二三");

        Iterator<String> iterator = objects.keySet().iterator();
        if (iterator.hasNext()) {
            String next = iterator.next();
            String s = objects.get(next);
            System.out.println(next + "---" + s);
        }
    }
}
