package com.xuan.design.behavior_type.command;

import com.xuan.design.behavior_type.command.command.Command;
import com.xuan.design.behavior_type.command.concrete_command.light.LightOffCommand;
import com.xuan.design.behavior_type.command.concrete_command.light.LightOnCommand;
import com.xuan.design.behavior_type.command.concrete_command.tv.TvOffCommand;
import com.xuan.design.behavior_type.command.concrete_command.tv.TvOnCommand;
import com.xuan.design.behavior_type.command.invoker.RemoteController;
import com.xuan.design.behavior_type.command.receiver.light.LightReceiver;
import com.xuan.design.behavior_type.command.receiver.tv.TvReceiver;

/**
 * 命令模式
 */
public class Client {

    public static void main(String[] args) {
        //创建命令接收者
        LightReceiver lightReceiver = new LightReceiver();
        //创建具体命令
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);
        //创建调用者
        RemoteController remoteController = new RemoteController();
        //设置命令具体操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println("-------对电灯的控制-----------");
        remoteController.offButtonWasPushed(0);
        remoteController.onButtonWasPushed(0);
        remoteController.undoButtonWasPushed();


        System.out.println("-------对电视的控制-----------");
        TvReceiver tvReceiver = new TvReceiver();
        Command tvOnCommand = new TvOnCommand(tvReceiver);
        Command tvOffCommand = new TvOffCommand(tvReceiver);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        remoteController.offButtonWasPushed(1);

    }
}
