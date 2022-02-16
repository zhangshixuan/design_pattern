package com.xuan.design.behavior_type.command.command;


/**
 * 没有命令，空执行。用于初始化
 */
public class NoCommand extends Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
