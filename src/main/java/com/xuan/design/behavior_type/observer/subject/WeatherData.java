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

    private List<Observer> list = new ArrayList<>();


    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

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

    @Override
    public void notifyObservers() {
        for (Observer o : list) {
            o.update(this.temperature,this.pressure,this.humidity);
        }
    }
}
