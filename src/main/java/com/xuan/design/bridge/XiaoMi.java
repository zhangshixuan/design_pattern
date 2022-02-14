package com.xuan.design.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XiaoMi implements Brand{
    @Override
    public void open() {
        log.info("xiaomi开机");
    }

    @Override
    public void close() {
        System.out.println("xiaomi关机");
    }

    @Override
    public void call() {
        System.out.println("xiaomi打电话");
    }
}
