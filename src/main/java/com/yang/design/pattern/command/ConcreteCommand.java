package com.yang.design.pattern.command;

/**
 * Created by Administrator on 2018/7/30.
 */
public class ConcreteCommand implements Command {

    Soldier soldier;

    ConcreteCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.executeCommand();
    }
}
