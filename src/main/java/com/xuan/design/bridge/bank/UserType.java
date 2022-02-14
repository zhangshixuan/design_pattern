package com.xuan.design.bridge.bank;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class UserType {
    private PlantForm plantForm;

    public UserType(PlantForm plantForm) {
        this.plantForm = plantForm;
    }

    protected void transfer() {
        this.plantForm.transfer();
    }

}
