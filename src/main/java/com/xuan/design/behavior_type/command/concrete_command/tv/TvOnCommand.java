package com.xuan.design.behavior_type.command.concrete_command.tv;

import com.xuan.design.behavior_type.command.command.Command;
import com.xuan.design.behavior_type.command.receiver.tv.TvReceiver;

public class TvOnCommand extends Command {

    private TvReceiver tvReceiver;

    public TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        status = 1;
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
