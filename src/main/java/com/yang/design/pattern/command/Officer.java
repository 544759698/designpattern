package com.yang.design.pattern.command;

/**
 * Created by Administrator on 2018/7/30.
 */
public class Officer {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sendCommand() {
        command.execute();
    }
}
