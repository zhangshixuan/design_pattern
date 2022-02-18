package com.xuan.design.behavior_type.observer.subject;

import com.xuan.design.behavior_type.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 固体的主题发布者
 */
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    //维护所有观察者
    private List<Observer> list = new ArrayList<>();

    //气象站改变天气数据
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    //有变更，就通知
    public void dataChange() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void remove(Observer o) {
        if (list.contains(o)) {
            list.remove(o);
        }
    }

    //通知所有观察者进行更新
    @Override
    public void notifyObservers() {
        for (Observer o : list) {
            o.update(this.temperature,this.pressure,this.humidity);
        }
    }
}
