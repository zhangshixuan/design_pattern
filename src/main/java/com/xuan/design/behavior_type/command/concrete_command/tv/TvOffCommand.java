package com.xuan.design.behavior_type.command.concrete_command.tv;

import com.xuan.design.behavior_type.command.command.Command;
import com.xuan.design.behavior_type.command.receiver.tv.TvReceiver;

public class TvOffCommand extends Command {

    private TvReceiver tvReceiver;


    public TvOffCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        status = 1;
        tvReceiver.on();
    }
}
