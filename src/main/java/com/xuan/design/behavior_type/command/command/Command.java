package com.xuan.design.behavior_type.command.command;

/**
 * 命令角色
 */
public abstract class Command {

    public volatile int status = 0;


    public abstract void execute();

    public abstract void undo();


}
