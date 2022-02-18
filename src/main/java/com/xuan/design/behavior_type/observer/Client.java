package com.xuan.design.behavior_type.observer;

import com.xuan.design.behavior_type.observer.observer.BaiduSiteConditon;
import com.xuan.design.behavior_type.observer.observer.CurrentCondition;
import com.xuan.design.behavior_type.observer.observer.Observer;
import com.xuan.design.behavior_type.observer.subject.Subject;
import com.xuan.design.behavior_type.observer.subject.WeatherData;

/**
 * 观察者模式
 */
public class Client {

    public static void main(String[] args) {
        //主题订阅者
        WeatherData weatherData = new WeatherData();
        //新建一个观察者
        CurrentCondition currentCondition = new CurrentCondition();
        //注册观察者
        weatherData.registerObserver(currentCondition);
        weatherData.setData(20,40,30);

//        weatherData.remove(currentCondition);

//        BaiduSiteConditon baiduSiteConditon = new BaiduSiteConditon();
//        weatherData.registerObserver(baiduSiteConditon);
//        weatherData.setData(25,30,15);


    }
}
