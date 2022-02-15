package com.xuan.design.structure_type.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int out220 = out220();
        int out5 = out220 / 44;
        System.out.println("适配器转化成" + out5);
        return out5;
    }
}
