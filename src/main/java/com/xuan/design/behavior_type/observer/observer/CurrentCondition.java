package com.xuan.design.behavior_type.observer.observer;

public class CurrentCondition implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    public void display() {
        System.out.println("Current***Today mTemperature: " + temperature + "***");
        System.out.println("Current***Today mPressure: " + pressure + "***");
        System.out.println("Current***Today mHumidity: " + humidity + "***");
    }
}
