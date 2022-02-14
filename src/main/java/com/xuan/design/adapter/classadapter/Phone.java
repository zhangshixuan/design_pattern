package com.xuan.design.adapter.classadapter;

public class Phone {
    public void chongdian(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5) {
            System.out.println("正在充电、、、、");
        } else {
            System.out.println("充电失败");
        }
    }
}
