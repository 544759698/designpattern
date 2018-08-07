package com.yang.design.pattern.observe.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2018/7/30.
 */
public class Student implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("学生接电话，找工作！！！" + (arg != null ? arg.toString() : ""));
    }
}
