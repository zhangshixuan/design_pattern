package com.xuan.design.behavior_type.command.concrete_command.light;

import com.xuan.design.behavior_type.command.command.Command;
import com.xuan.design.behavior_type.command.receiver.light.LightReceiver;

/**
 * 将接收者和命令绑定
 */
public class LightOnCommand extends Command {

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        status = 1;
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
