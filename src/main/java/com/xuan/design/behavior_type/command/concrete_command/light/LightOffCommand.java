package com.xuan.design.behavior_type.command.concrete_command.light;

import com.xuan.design.behavior_type.command.command.Command;
import com.xuan.design.behavior_type.command.receiver.light.LightReceiver;

public class LightOffCommand extends Command {

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }


    @Override
    public void execute() {
        lightReceiver.off();

    }

    @Override
    public void undo() {
        status = 1;
        lightReceiver.on();

    }
}
