package com.xuan.design.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int out220 = voltage220V.out220();
        int out5 = out220 / 44;
        System.out.println("适配器转化成" + out5);
        return out5;
    }
}
