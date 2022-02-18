package com.xuan.design.behavior_type.observer.subject;

import com.xuan.design.behavior_type.observer.observer.Observer;

/**
 * 主题发布者接口
 */
public interface Subject {

    //注册观察者
    void registerObserver(Observer o);

    //移除观察者
    void remove(Observer o);

    void notifyObservers();
}
