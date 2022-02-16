package com.xuan.design.behavior_type.command.invoker;

import com.xuan.design.behavior_type.command.command.Command;
import com.xuan.design.behavior_type.command.command.NoCommand;

public class RemoteController {

    //开按钮命令数组
    Command[] onCommands;
    Command[] offCommands;

    //执行撤销命令
    Command undoCommand;


    public RemoteController() {
        //初始化五个开按钮和关按钮
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            //一开始不知道是什么命令，所以用NoCommand
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给开和关按钮设置真正的命令
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }


    /**
     * 当按钮被真正按下去
     * @param no
     */
    public void onButtonWasPushed(int no) {
        if (offCommands[no] != null && offCommands[no].status == 0) {
            /**
             * 找到按下开的按钮，调用具体命令
             */
            onCommands[no].execute();

            //记录当前命令，以便于撤销
            undoCommand = onCommands[no];
        }
    }

    /**
     * 当关闭按钮按下去
     * @param no
     */
    public void offButtonWasPushed(int no) {
        if (offCommands[no] != null && offCommands[no].status == 1) {
            offCommands[no].execute();

            //记录当前命令，以便于撤销
            undoCommand = offCommands[no];
        }
    }

    /**
     * 撤销按钮按下
     */
    public void undoButtonWasPushed() {
        if (undoCommand != null && undoCommand.status == 1) {
            undoCommand.undo();
        }
    }
}
