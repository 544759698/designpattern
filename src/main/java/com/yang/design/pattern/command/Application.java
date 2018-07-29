package com.yang.design.pattern.command;

/**
 * Created by Administrator on 2018/7/29.
 */
public class Application {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        Command command = new ConcreteCommand(soldier);
        Officer officer = new Officer();
        officer.setCommand(command);
        officer.sendCommand();
    }

}
