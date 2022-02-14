package com.xuan.design.bridge.bank;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonUser extends UserType {
    public CommonUser(PlantForm plantForm) {
        super(plantForm);
    }

    @Override
    protected void transfer() {
        log.info("普通用户开始转账");
        super.transfer();
    }
}
